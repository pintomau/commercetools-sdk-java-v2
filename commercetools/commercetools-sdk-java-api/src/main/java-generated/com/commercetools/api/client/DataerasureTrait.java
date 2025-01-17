
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface DataerasureTrait<T extends DataerasureTrait<T>> {
    List<String> getDataErasure();

    /**
     * set dataErasure with the specificied value
     */
    DataerasureTrait<T> withDataErasure(final boolean dataErasure);

    /**
     * add additional dataErasure query parameter
     */
    DataerasureTrait<T> addDataErasure(final boolean dataErasure);

    default DataerasureTrait<T> asDataerasureTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asDataerasureTraitToBaseType() {
        return (T) this;
    }
}
