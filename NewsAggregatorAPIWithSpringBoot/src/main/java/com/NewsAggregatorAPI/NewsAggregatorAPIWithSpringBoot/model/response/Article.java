package com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.response;

public record Article(String title, String description, String content, String url, String image,
                      String publishedAt)
{

}
