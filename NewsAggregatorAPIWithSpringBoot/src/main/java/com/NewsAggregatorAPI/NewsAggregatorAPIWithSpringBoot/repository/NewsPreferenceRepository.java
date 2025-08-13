package com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.repository;

import java.util.Set;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.entity.NewsPreference;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.entity.User;
import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.model.enums.NewsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class NewsPreferenceRepository {

    Set<NewsPreference> findByUser(User user);

    void deleteByUserAndCategory(User user, NewsCategory category);

    boolean existsByUserAndCategory(User user, NewsCategory category);

}
