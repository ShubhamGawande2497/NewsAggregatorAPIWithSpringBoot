package com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.controller;

import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.response.ApiResponse;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.response.NewsResponse;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<NewsResponse>>> getNews() {
        List<NewsResponse> news = newsService.getNewsForUser();
        return ResponseEntity.ok(new ApiResponse<>(true, "News retrieved successfully", news));
    }

}
