package com.ryo.film.utils;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Dates {
    public String random() {
        LocalDate startDate = LocalDate.of(2000, 1, 1); // start date
        long start = startDate.toEpochDay();

        LocalDate endDate = LocalDate.now(); // end date
        long end = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();

        return String.valueOf(LocalDate.ofEpochDay(randomEpochDay));
    }
}
