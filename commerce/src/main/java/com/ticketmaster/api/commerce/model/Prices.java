package com.ticketmaster.api.commerce.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ticketmaster.discovery.model.BaseModel;
import lombok.*;

import java.util.List;

/**
 * Created by jingshanyin on 4/21/18.
 */

@ToString(callSuper = true)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Prices extends BaseModel {

    private List<Data> data;

    @ToString(callSuper = true)
    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class Data extends BaseModel {
        private String id;
        private String type;
        private Attributes attributes;
    }

    @ToString(callSuper = true)
    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class Attributes extends BaseModel {
        private String currency;
        private String value;
    }

}
