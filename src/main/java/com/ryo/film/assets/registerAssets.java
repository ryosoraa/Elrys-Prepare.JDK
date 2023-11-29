package com.ryo.film.assets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RegisterAssets {
    Random random = new Random();

    public List<String> names() throws JsonProcessingException, IOException {
        List<String> name = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/names.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            name.add(data.asText());
        }

        return name;

    }

    public List<String> citys() throws JsonProcessingException, IOException {
        List<String> citys = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/citys.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            citys.add(data.asText());
        }

        return citys;

    }

    public List<String> country() throws JsonProcessingException, IOException {
        List<String> country = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/countrys.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            country.add(data.asText());
        }

        return country;

    }

    public List<String> degress() throws JsonProcessingException, IOException {
        List<String> degress = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/degress.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            degress.add(data.asText());
        }

        return degress;

    }

    public List<String> interests() throws JsonProcessingException, IOException {
        List<String> interests = new ArrayList<>();
        List<String> results = new ArrayList<>();

        String path = "src/main/java/com/ryo/film/json/interests.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            interests.add(data.asText());
        }

        for (int x = 0; x < random.nextInt(10); x++) {
            results.add(interests.get(random.nextInt(66)));
        }

        return results;

    }

    public List<String> languages() throws JsonProcessingException, IOException {
        List<String> languages = new ArrayList<>();
        List<String> results = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/languages.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            languages.add(data.asText());
        }

        for (int x = 0; x < random.nextInt(10); x++) {
            results.add(languages.get(random.nextInt(65)));
        }

        return results;

    }

    public List<String> majors() throws JsonProcessingException, IOException {
        List<String> majors = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/majors.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            majors.add(data.asText());
        }

        return majors;

    }

    public List<String> occupations() throws JsonProcessingException, IOException {
        List<String> occupations = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/occupations.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            occupations.add(data.asText());
        }

        return occupations;

    }

    public List<String> preferences() throws JsonProcessingException, IOException {
        List<String> preferences = new ArrayList<>();
        List<String> results = new ArrayList<>();

        String path = "src/main/java/com/ryo/film/json/preferences.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            preferences.add(data.asText());
        }

        for (int x = 0; x < random.nextInt(10); x++) {
            results.add(preferences.get(random.nextInt(68)));
        }

        return results;

    }

    public List<String> schools() throws JsonProcessingException, IOException {
        List<String> schools = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/schools.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            schools.add(data.asText());
        }

        return schools;

    }

    public List<String> skills() throws JsonProcessingException, IOException {
        List<String> skills = new ArrayList<>();
        List<String> results = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/skills.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            skills.add(data.asText());
        }

        for (int x = 0; x < random.nextInt(10); x++) {
            results.add(skills.get(random.nextInt(73)));
        }

        return results;

    }

    public List<String> streets() throws JsonProcessingException, IOException {
        List<String> streets = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/streets.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            streets.add(data.asText());
        }

        return streets;

    }

    public List<String> gender() throws JsonProcessingException, IOException {
        List<String> gender = new ArrayList<>();
        String path = "src/main/java/com/ryo/film/json/gender.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            gender.add(data.asText());
        }

        return gender;

    }

}
