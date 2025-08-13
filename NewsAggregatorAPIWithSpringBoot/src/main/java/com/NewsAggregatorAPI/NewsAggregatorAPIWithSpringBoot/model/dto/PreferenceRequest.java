package com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.dto;

public class PreferenceRequest {

    @NotEmpty(message = "At least one category is required")
    private Set<NewsCategory> categories;

    public PreferenceRequest(Set<NewsCategory> categories) {
        this.categories = categories;
    }

    public Set<NewsCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<NewsCategory> categories) {
        this.categories = categories;
    }

}
