
package com.commercetools.importapi.models.products;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.products.SuggestTokenizer;
import com.commercetools.importapi.models.products.WhitespaceTokenizer;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class WhitespaceTokenizerBuilder {

    public WhitespaceTokenizer build() {
        return new WhitespaceTokenizerImpl();
    }

    public static WhitespaceTokenizerBuilder of() {
        return new WhitespaceTokenizerBuilder();
    }

    public static WhitespaceTokenizerBuilder of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerBuilder builder = new WhitespaceTokenizerBuilder();
        return builder;
    }

}
