package com.github.enterprisejava.cocktails.model;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CocktailRepository implements Serializable {

    List<Cocktail> cocktails;

    public CocktailRepository() {
        cocktails = new ArrayList<>();
        cocktails.add(new Cocktail("Gin Tonic"));
        cocktails.add(new Cocktail("Mai Tai"));
        cocktails.add(new Cocktail("Cuba Libre"));
    }

    public List<Cocktail> findAll() {
        return cocktails;
    }

    public List<Cocktail> findByName(String name) {
        return cocktails.stream()
                .filter(cocktail -> cocktail.getName().startsWith(name))
                .collect(Collectors.toList());
    }
}
