package com.ryo.film.assets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilmAssets {
    public List<String> type() throws JsonProcessingException, IOException {
        List<String> type = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/type.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            type.add(data.asText());
        }

        return type;

    }

    public List<String> title() throws JsonProcessingException, IOException {
        List<String> title = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/title.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            title.add(data.asText());
        }

        return title;

    }

    public List<String> directors() throws JsonProcessingException, IOException {
        List<String> directors = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/directors.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            directors.add(data.asText());
        }

        return directors;

    }

    public List<String> genre() throws JsonProcessingException, IOException {
        Random random = new Random();
        List<String> genre = new ArrayList<>();
        List<String> results = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/genres.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            genre.add(data.asText());
        }

        for (int x = 0; x < random.nextInt(10); x++) {
            results.add(genre.get(random.nextInt(65)));
        }

        return results;

    }

    public List<String> formats() throws JsonProcessingException, IOException {
        List<String> formats = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/formats.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            formats.add(data.asText());
        }

        return formats;

    }
}
