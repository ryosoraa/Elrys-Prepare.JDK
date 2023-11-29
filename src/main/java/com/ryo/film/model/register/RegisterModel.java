package com.ryo.film.model.register;

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