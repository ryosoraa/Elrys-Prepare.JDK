package com.ryo.film.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ryo.film.api.JerseyClient;
import com.ryo.film.assets.RegisterAssets;
import com.ryo.film.model.RegisterModel;

public class RegisterService {

    RegisterAssets registerAssets = new RegisterAssets();
    JerseyClient jerseyClient = new JerseyClient();
    ObjectMapper mapper = new ObjectMapper();

    private String bodyUrl = "http://192.168.20.90:9200/elrys/_doc/";

    public void register() throws JsonProcessingException, IOException {

        for (String email : registerAssets.names()) {
            System.out.println(email);
            JsonNode postRequest = jerseyClient.postRequest(bodyUrl, mapper.writeValueAsString(
                    RegisterModel.builder()
                            .email(email.toLowerCase().concat("@gmail.com"))
                            .password(email.toLowerCase())
                            .build()));
            System.out.println(postRequest);
        }
    }
}
