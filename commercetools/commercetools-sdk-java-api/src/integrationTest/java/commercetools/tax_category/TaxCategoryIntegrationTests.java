
package commercetools.tax_category;

import static commercetools.tax_category.TaxCategoryFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.tax_category.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class TaxCategoryIntegrationTests {

    @Test
    public void createAndDelete() {
        TaxCategoryDraft taxCategoryDraft = TaxCategoryDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .rates(TaxRateDraftBuilder.of()
                        .name(CommercetoolsTestUtils.randomString())
                        .amount(0.19)
                        .includedInPrice(true)
                        .country("DE")
                        .state("Berlin")
                        .build())
                .build();

        TaxCategory taxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                .taxCategories()
                .post(taxCategoryDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(taxCategory);
        Assert.assertEquals(taxCategoryDraft.getName(), taxCategory.getName());
        Assert.assertEquals(taxCategoryDraft.getKey(), taxCategory.getKey());

        TaxCategory deletedTaxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                .taxCategories()
                .withId(taxCategory.getId())
                .delete()
                .withVersion(taxCategory.getVersion())
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedTaxCategory);
        Assert.assertEquals(deletedTaxCategory.getId(), taxCategory.getId());
    }

    @Test
    public void getById() {
        withTaxCategory(taxCategory -> {
            TaxCategory queriedTaxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .taxCategories()
                    .withId(taxCategory.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedTaxCategory);
            Assert.assertEquals(queriedTaxCategory.getId(), taxCategory.getId());
        });
    }

    @Test
    public void getByKey() {
        withTaxCategory(taxCategory -> {
            TaxCategory queriedTaxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .taxCategories()
                    .withKey(taxCategory.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedTaxCategory);
            Assert.assertEquals(queriedTaxCategory.getKey(), taxCategory.getKey());
        });
    }

    @Test
    public void query() {
        withTaxCategory(taxCategory -> {
            TaxCategoryPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .taxCategories()
                    .get()
                    .withWhere("id=" + "\"" + taxCategory.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), taxCategory.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableTaxCategory(taxCategory -> {

            List<TaxCategoryUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TaxCategorySetKeyActionBuilder.of().key(newKey).build());

            TaxCategory updatedTaxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .taxCategories()
                    .withId(taxCategory.getId())
                    .post(
                        TaxCategoryUpdateBuilder.of().actions(updateActions).version(taxCategory.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedTaxCategory);
            Assert.assertEquals(updatedTaxCategory.getKey(), newKey);

            return updatedTaxCategory;
        });
    }

    @Test
    public void updateByIKey() {
        withUpdateableTaxCategory(taxCategory -> {

            List<TaxCategoryUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TaxCategorySetKeyActionBuilder.of().key(newKey).build());

            TaxCategory updatedTaxCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .taxCategories()
                    .withKey(taxCategory.getKey())
                    .post(
                        TaxCategoryUpdateBuilder.of().actions(updateActions).version(taxCategory.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedTaxCategory);
            Assert.assertEquals(updatedTaxCategory.getKey(), newKey);

            return updatedTaxCategory;
        });
    }

}
