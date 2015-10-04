package com.github.enterprisejava.cocktails.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class Search implements Serializable {
    private String searchString;
    private List<Cocktail> results;

    @Inject
    CocktailRepository cocktailRepository;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public List<Cocktail> getResults() {
        return results;
    }

    public String doSearch() {
        if(searchString == null || searchString.isEmpty()) {
            results = cocktailRepository.findAll();
        } else {
            results = cocktailRepository.findByName(searchString);
        }
        return "results";
    }
}
