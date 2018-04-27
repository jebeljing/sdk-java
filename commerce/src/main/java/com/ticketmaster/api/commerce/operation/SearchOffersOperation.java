package com.ticketmaster.api.commerce.operation;

import com.ticketmaster.api.discovery.operation.PagedOperation;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by jingshanyin on 4/21/18.
 */

@ToString
@EqualsAndHashCode
public class SearchOffersOperation extends PagedOperation<SearchOffersOperation> {

    public SearchOffersOperation accessToken(String accessToken) {
        return withParam("access_token", accessToken);
    }

    public SearchOffersOperation apiKey(String apiKey) {
        return withParam("api-key", apiKey);
    }

    @Override
    protected SearchOffersOperation getThis() {
        return this;
    }
}
