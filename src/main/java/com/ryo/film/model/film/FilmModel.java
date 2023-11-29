package com.ryo.film.model.film;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FilmModel {
    private String email;
    private String type;
    private String title;
    private String director;
    private String release;
    private List<String> genre;
    private Integer rating;
    private String format;
    private Integer runtime;
    private String language;
    private List<String> subtitles;
    private Integer price;
}