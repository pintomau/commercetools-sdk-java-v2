package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.MoneyType;
import com.commercetools.importer.models.common.TypedMoney;
import com.commercetools.importer.models.common.MoneyImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MoneyImpl.class)
public interface Money extends TypedMoney {



    public static MoneyImpl of(){
        return new MoneyImpl();
    }
    

    public static MoneyImpl of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        return instance;
    }

}