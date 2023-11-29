package com.ryo.film.service;

import java.io.IOException;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ryo.film.api.JerseyClient;
import com.ryo.film.assets.FilmAssets;
import com.ryo.film.assets.RegisterAssets;
import com.ryo.film.model.film.FilmModel;
import com.ryo.film.utils.Dates;

public class FIlmService {

    JerseyClient client = new JerseyClient();
    RegisterAssets registerAssets = new RegisterAssets();
    FilmAssets filmAssets = new FilmAssets();
    ObjectMapper mapper = new ObjectMapper();
    Random random = new Random();
    Dates dates = new Dates();

    private String bodyUrl = "http://192.168.20.90:9200/elrys_film/_doc/";

    public void film() throws JsonProcessingException, IOException {

        for (String name : registerAssets.names()) {
            for (int x = 0; x < random.nextInt(10); x++) {
                try {
                    JsonNode response = client.postRequest(bodyUrl, mapper.writeValueAsString(FilmModel.builder()
                            .email(name.toLowerCase().concat("@gmail.com"))
                            .type("film")
                            .title(filmAssets.title().get(random.nextInt(430)))
                            .director(filmAssets.directors().get(random.nextInt(180)))
                            .release(dates.random())
                            .genre(filmAssets.genre())
                            .rating(random.nextInt(10))
                            .format(filmAssets.formats().get(random.nextInt(63)))
                            .runtime(random.nextInt(240))
                            .language(registerAssets.languages().get(0))
                            .subtitles(registerAssets.languages())
                            .price(random.nextInt(100))
                            .build()));
                    System.out.println(response);
                } catch (Exception e) {
                    System.out.println("error");
                }

            }
        }
    }
}
