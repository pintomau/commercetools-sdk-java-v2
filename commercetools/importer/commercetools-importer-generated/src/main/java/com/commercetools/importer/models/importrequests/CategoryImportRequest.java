package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.categories.CategoryImport;
import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.importrequests.CategoryImportRequestImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>An import request for multiple category import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryImportRequestImpl.class)
public interface CategoryImportRequest extends ImportRequest {

   /**
   *  <p>The category import resources of this request.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("resources")
   public List<CategoryImport> getResources();

   public void setResources(final List<CategoryImport> resources);
   
   public static CategoryImportRequestImpl of(){
      return new CategoryImportRequestImpl();
   }
   

   public static CategoryImportRequestImpl of(final CategoryImportRequest template) {
      CategoryImportRequestImpl instance = new CategoryImportRequestImpl();
      instance.setResources(template.getResources());
      return instance;
   }

}