package com.hostingtutorials.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Country {
    private String name;
    private String capital;
    private int population;

    public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
}
