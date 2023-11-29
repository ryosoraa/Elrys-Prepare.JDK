package com.ryo.film.model.register;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
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