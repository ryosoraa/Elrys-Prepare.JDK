package com.ryo.film.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegisterModel {

    private String email;

    private String password;

    private String username;

    private String fullName;

    private String dateOfBirth;

    private Address address;

    private AdditionalInfo additional_info;

}

/**
 * InnerUpdateDTO
 */
@Data
class Address {

    private String street;

    private String city;

    private Integer postalCode;

    private String country;

}

/**
 * InnerUpdateDTO
 */
@Data
class AdditionalInfo {

    // Additional info

    private Integer phone;

    private String gender;

    private Boolean newsletter_subscription;

    private List<String> preference;

    private String occupation;

    // Education

    private String degree;

    private String major;

    private String school;

    private List<String> interests;

    private List<String> skills;

    private List<String> languages;

}
