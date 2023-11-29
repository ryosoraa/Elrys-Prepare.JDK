package com.ryo.film.model.register;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {

    private String street;

    private String city;

    private Integer postalCode;

    private String country;

}
