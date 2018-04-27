package com.ticketmaster.api.commerce;

import com.ticketmaster.api.commerce.model.Offers;
import com.ticketmaster.api.commerce.operation.SearchOffersOperation;
import com.ticketmaster.api.discovery.response.PagedResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by jingshanyin on 4/21/18.
 */
public class CommerceApi {

    private Logger logger = LoggerFactory.getLogger(CommerceApi.class);

//    private final Map<Class<?>, String> pathByType;

    public PagedResponse<Offers> searchOffers(SearchOffersOperation operation) {
        logger.debug("searchOffers invoked with {}", operation);

//        Builder builder = urlBuilder(pathByType.get(Offer))
        return null;
    }
}
