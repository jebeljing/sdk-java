package com.ticketmaster.discovery.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class ResourceSupport extends BaseModel {

  @Getter(AccessLevel.PRIVATE)
  @Setter(AccessLevel.PRIVATE)
  @JsonProperty("_embedded")
  public Embedded embedded;

  @Getter
  @Setter
  @ToString
  @EqualsAndHashCode
  @NoArgsConstructor
  public static class Embedded {
    public List<Venue> venues;
    public  List<Attraction> attractions;
    public List<Category> categories;
  }

}
