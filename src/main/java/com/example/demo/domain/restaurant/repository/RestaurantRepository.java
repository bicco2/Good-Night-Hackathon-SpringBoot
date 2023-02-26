package com.example.demo.domain.restaurant.repository;

import com.example.demo.domain.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
