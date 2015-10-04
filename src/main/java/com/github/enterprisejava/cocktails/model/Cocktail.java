package com.github.enterprisejava.cocktails.model;

import java.io.Serializable;

public class Cocktail implements Serializable {

    private String name;

    public Cocktail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
