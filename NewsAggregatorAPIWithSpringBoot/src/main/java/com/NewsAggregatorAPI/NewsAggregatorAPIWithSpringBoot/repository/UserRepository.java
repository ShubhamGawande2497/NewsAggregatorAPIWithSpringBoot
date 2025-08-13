package com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.repository;

import com.NewsAggregatorAPI.NewsAggregatorAPIWithSpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}
