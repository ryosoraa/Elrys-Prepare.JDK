package com.ryo.film.assets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class registerAssets {
    public List<String> names() throws JsonProcessingException, IOException {
        List<String> name = new ArrayList<>();
        String path = "/src/main/java/com/ryo/film/json/names.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            name.add(data.asText());
        }

        return name;

    }
}
