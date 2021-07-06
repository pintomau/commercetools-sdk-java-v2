package commercetools.order;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.channel.*;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerDraftBuilder;
import com.commercetools.api.models.customer.CustomerSignInResult;
import com.commercetools.api.models.order.*;
import com.commercetools.api.models.payment.*;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.*;
import com.commercetools.api.models.state.*;
import com.commercetools.api.models.tax_category.*;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Properties;

public class CheckoutTests {

    @Test
    public void checkout() {
        String key = CommercetoolsTestUtils.randomKey();
        String value = "value-" + CommercetoolsTestUtils.randomString();

        //ProductType
        ProductTypeDraft productTypeDraft = ProductTypeDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .description(CommercetoolsTestUtils.randomString())
                .build();
        ProductType productType = CommercetoolsTestUtils.getProjectRoot()
                .productTypes()
                .post(productTypeDraft)
                .executeBlocking()
                .getBody();

        //Tax Category
        TaxCategoryDraft taxCategoryDraft = TaxCategoryDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .rates(TaxRateDraftBuilder.of()
                        .amount(0.2)
                        .name(CommercetoolsTestUtils.randomString())
                        .includedInPrice(true)
                        .country("DE")
                        .build()
                )
                .build();
        TaxCategory taxCategory = CommercetoolsTestUtils.getProjectRoot()
                .taxCategories()
                .post(taxCategoryDraft)
                .executeBlocking()
                .getBody();

        //Create Channel
        ChannelDraft channelDraft = ChannelDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .roles(Arrays.asList(ChannelRoleEnum.PRODUCT_DISTRIBUTION))
                .geoLocation(GeoJsonPointBuilder.of().coordinates(Arrays.asList(13.0, 51.0)).build())
                .build();
        Channel channel = CommercetoolsTestUtils.getProjectRoot()
                .channels()
                .post(channelDraft)
                .executeBlocking()
                .getBody();

        //Product
        ProductDraft productDraft = ProductDraftBuilder.of()
                .productType(
                        ProductTypeResourceIdentifierBuilder.of()
                            .id(productType.getId())
                            .build()
                )
                .name(LocalizedStringBuilder.of().addValue(key, value).build())
                .slug(LocalizedStringBuilder.of().addValue(key, value).build())
                .taxCategory(
                        TaxCategoryResourceIdentifierBuilder.of()
                            .id(taxCategory.getId())
                            .build()
                )
                .publish(true)
                .masterVariant(ProductVariantDraftBuilder.of()
                        .sku(CommercetoolsTestUtils.randomString())
                        .prices(
                             PriceDraftBuilder.of()
                                  .channel(
                                        ChannelResourceIdentifierBuilder.of()
                                             .id(channel.getId())
                                             .build()
                                  )
                                  .country("DE")
                                  .value(
                                        MoneyBuilder.of()
                                             .centAmount(10L)
                                             .currencyCode("EUR")
                                             .build()
                                  )
                                  .build()
                        )
                        .build()
                )
                .build();
        Product product = CommercetoolsTestUtils.getProjectRoot()
                .products()
                .post(productDraft)
                .executeBlocking()
                .getBody();

        //Create Customer
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .email(CommercetoolsTestUtils.randomString() .concat("@gmail.com"))
                .password(CommercetoolsTestUtils.randomString())
                .firstName("NAME" .concat( CommercetoolsTestUtils.randomString()))
                .lastName("NAME" .concat( CommercetoolsTestUtils.randomString()))
                .addresses(
                        AddressBuilder.of()
                            .city("Berlin")
                            .country("DE")
                            .build()
                )
                .defaultShippingAddress(0L)
                .build();
        CustomerSignInResult customer = CommercetoolsTestUtils.getProjectRoot()
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody();

        //Create the State
        LocalizedString description = LocalizedStringBuilder.of().addValue(key, value).build();
        StateDraft stateDraft = StateDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .type(StateTypeEnum.LINE_ITEM_STATE)
                .description(description)
                .initial(true)
                .build();
        State state = CommercetoolsTestUtils.getProjectRoot()
                .states()
                .post(stateDraft)
                .executeBlocking()
                .getBody();


        //Get Customer
        Customer customerQuery = CommercetoolsTestUtils.getProjectRoot()
                .customers()
                .withKey(customer.getCustomer().getKey())
                .get()
                .executeBlocking()
                .getBody();

        //Create Cart
        Cart cart = CommercetoolsTestUtils.getProjectRoot()
                        .carts()
                        .post(
                                CartDraftBuilder.of()
                                    .currency("EUR")
                                    .customerEmail(customerQuery.getEmail())
                                    .customerId(customerQuery.getId())
                                    .country(customerQuery.getAddresses().get(0).getCountry())
                                    .shippingAddress(customerQuery.getAddresses().get(0))
                                    .inventoryMode(InventoryMode.RESERVE_ON_ORDER)
                                    .lineItems(LineItemDraftBuilder.of()
                                                .quantity(1L)
                                                .variantId(product.getMasterData().getCurrent().getMasterVariant().getId())
                                                .productId(product.getId())
                                                .build()
                                    )
                                    .build()
                        )
                        .executeBlocking()
                        .getBody();

        //Add Product to the Cart
        Cart cartWithProduct = CommercetoolsTestUtils.getProjectRoot()
                .carts()
                .withId(cart.getId())
                .post(
                        CartUpdateBuilder.of()
                            .version(cart.getVersion())
                            .actions(
                                    CartAddLineItemActionBuilder.of()
                                        .productId(product.getId())
                                        .variantId(product.getMasterData().getCurrent().getMasterVariant().getId())
                                        .quantity(1L)
                                        .build()
                            )
                            .build()
                )
                .executeBlocking()
                .getBody();

        //Create Payment
        Payment payment = CommercetoolsTestUtils.getProjectRoot()
                .payments()
                .post(
                        PaymentDraftBuilder.of()
                            .amountPlanned(
                                MoneyBuilder.of()
                                        .centAmount(cart.getTotalPrice().getCentAmount())
                                        .currencyCode(cart.getTotalPrice().getCurrencyCode())
                                        .build()
                            )
                            .paymentMethodInfo(
                                PaymentMethodInfoBuilder.of()
                                    .paymentInterface("We_Do_Payments")
                                    .method("CreditCard")
                                    .build()
                            )
                            .interfaceId(CommercetoolsTestUtils.randomId())
                            .build()
                )
                .executeBlocking()
                .getBody();

        //Payment update
        Payment paymentUpdateTransaction = CommercetoolsTestUtils.getProjectRoot()
                .payments()
                .withId(payment.getId())
                .post(
                        PaymentUpdateBuilder.of()
                            .version(payment.getVersion())
                            .actions(
                                PaymentAddTransactionActionBuilder.of()
                                    .transaction(
                                        TransactionDraftBuilder.of()
                                        .amount(
                                                MoneyBuilder.of()
                                                        .centAmount(cart.getTotalPrice().getCentAmount())
                                                        .currencyCode(cart.getTotalPrice().getCurrencyCode())
                                                        .build()
                                        )
                                        .timestamp(ZonedDateTime.now())
                                        .type(TransactionType.CHARGE)
                                        .interactionId(CommercetoolsTestUtils.randomId())
                                        .build()
                                    )
                                    .build(),
                                PaymentSetStatusInterfaceCodeActionBuilder.of()
                                    .interfaceCode("SUCCESS")
                                    .build(),
                                PaymentSetStatusInterfaceTextActionBuilder.of()
                                    .interfaceText("Money Received")
                                    .build()
                        )
                        .build()
                )
                .executeBlocking()
                .getBody();

        //Set Payment in the Cart
        Cart cartWithPayment = CommercetoolsTestUtils.getProjectRoot()
                .carts()
                .withId(cartWithProduct.getId())
                .post(
                        CartUpdateBuilder.of()
                            .version(cartWithProduct.getVersion())
                            .actions(
                                    CartAddPaymentActionBuilder.of()
                                            .payment(
                                                    PaymentResourceIdentifierBuilder.of()
                                                            .id(paymentUpdateTransaction.getId())
                                                            .build()
                                                    )
                                                    .build()
                            )
                            .build()
                )
                .executeBlocking()
                .getBody();

        // Create Order
        Order order = CommercetoolsTestUtils.getProjectRoot()
                        .orders()
                        .post(
                                OrderFromCartDraftBuilder.of()
                                .cart(CartResourceIdentifierBuilder.of()
                                        .id(cartWithPayment.getId())
                                        .build())
                                .build()
                        )
                        .executeBlocking()
                        .getBody();

        //Change Order State
        Order orderChangedState = CommercetoolsTestUtils.getProjectRoot()
                                    .orders()
                                    .withId(order.getId())
                                    .post(OrderUpdateBuilder.of()
                                            .version(order.getVersion())
                                            .actions(OrderChangeOrderStateActionBuilder.of()
                                                    .orderState(OrderState.COMPLETE)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .executeBlocking()
                                    .getBody();

        //Change Workflow State
        Order orderChangedWorkflowState = CommercetoolsTestUtils.getProjectRoot()
                                            .orders()
                                            .withId(orderChangedState.getId())
                                            .post(
                                                    OrderUpdateBuilder.of()
                                                    .version(orderChangedState.getVersion())
                                                    .actions(
                                                            OrderTransitionStateActionBuilder.of()
                                                            .state(
                                                                    StateResourceIdentifierBuilder.of()
                                                                    .id(state.getId())
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .executeBlocking()
                                            .getBody();

        Assert.assertTrue(orderChangedWorkflowState != null);
    }


}
