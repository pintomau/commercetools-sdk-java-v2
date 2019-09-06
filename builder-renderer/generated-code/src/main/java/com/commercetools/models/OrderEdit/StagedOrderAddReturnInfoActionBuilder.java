package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ReturnItemDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.OrderEdit.StagedOrderAddReturnInfoAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddReturnInfoActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime returnDate;
   
   @Nullable
   private java.lang.String returnTrackingId;
   
   
   private java.util.List<com.commercetools.models.Order.ReturnItemDraft> items;
   
   public StagedOrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
      this.returnDate = returnDate;
      return this;
   }
   
   public StagedOrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final java.lang.String returnTrackingId) {
      this.returnTrackingId = returnTrackingId;
      return this;
   }
   
   public StagedOrderAddReturnInfoActionBuilder items( final java.util.List<com.commercetools.models.Order.ReturnItemDraft> items) {
      this.items = items;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getReturnDate(){
      return this.returnDate;
   }
   
   @Nullable
   public java.lang.String getReturnTrackingId(){
      return this.returnTrackingId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ReturnItemDraft> getItems(){
      return this.items;
   }

   public StagedOrderAddReturnInfoAction build() {
       return new StagedOrderAddReturnInfoActionImpl(returnDate, returnTrackingId, items);
   }
   
   public static StagedOrderAddReturnInfoActionBuilder of() {
      return new StagedOrderAddReturnInfoActionBuilder();
   }
   
   public static StagedOrderAddReturnInfoActionBuilder of(final StagedOrderAddReturnInfoAction template) {
      StagedOrderAddReturnInfoActionBuilder builder = new StagedOrderAddReturnInfoActionBuilder();
      builder.returnDate = template.getReturnDate();
      builder.returnTrackingId = template.getReturnTrackingId();
      builder.items = template.getItems();
      return builder;
   }
   
}