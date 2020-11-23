package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class ApiServerException extends ApiHttpException {
    public ApiServerException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }
}