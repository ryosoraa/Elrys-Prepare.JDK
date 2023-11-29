package com.ryo.film.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ryo.film.api.JerseyClient;
import com.ryo.film.assets.RegisterAssets;
import com.ryo.film.model.register.AdditionalInfo;
import com.ryo.film.model.register.Address;
import com.ryo.film.model.register.RegisterModel;
import com.ryo.film.utils.Dates;

public class RegisterService {

    RegisterAssets assets = new RegisterAssets();
    JerseyClient jerseyClient = new JerseyClient();
    ObjectMapper mapper = new ObjectMapper();
    Dates dates = new Dates();
    Random random = new Random();
    Boolean[] subs = { true, false };

    private String bodyUrl = "http://192.168.20.90:9200/elrys/_doc/";

    public void register() throws JsonProcessingException, IOException {

        for (String email : assets.names()) {
            System.out.println(email);
            JsonNode postRequest = jerseyClient.postRequest(bodyUrl, mapper.writeValueAsString(
                    RegisterModel.builder()
                            .email(email.toLowerCase().concat("@gmail.com"))
                            .password(email.toLowerCase())
                            .username(email)
                            .fullName(email)
                            .dateOfBirth(dates.random())
                            .address(Address.builder()
                                    .street(assets.streets().get(random.nextInt(98)))
                                    .city(assets.citys().get(random.nextInt(170)))
                                    .postalCode(random.nextInt(999999))
                                    .country(assets.country().get(random.nextInt(190)))
                                    .build())
                            .additional_info(AdditionalInfo.builder()
                                    .phone(random.nextInt(999999))
                                    .gender(assets.gender().get(15))
                                    .newsletter_subscription(subs[random.nextInt(1)])
                                    .preference(assets.preferences())
                                    .occupation(assets.occupations().get(random.nextInt(90)))
                                    .degree(assets.degress().get(random.nextInt(36)))
                                    .major(assets.majors().get(45))
                                    .school(assets.schools().get(41))
                                    .interests(assets.interests())
                                    .skills(assets.skills())
                                    .languages(assets.languages())
                                    .build())
                            .build()));
            System.out.println(postRequest);
        }
    }
}
