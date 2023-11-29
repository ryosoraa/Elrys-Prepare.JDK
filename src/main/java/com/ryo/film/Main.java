package com.ryo.film;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ryo.film.service.RegisterService;
import com.ryo.film.utils.Dates;

public class Main {
    public static void main(String[] args) throws JsonProcessingException, IOException {
        System.out.println("Hello world!");
        RegisterService register = new RegisterService();
        register.register();
    }
}