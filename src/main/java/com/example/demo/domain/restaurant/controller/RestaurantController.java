package com.example.demo.domain.restaurant.controller;


import com.example.demo.domain.Type.Type;
import com.example.demo.domain.restaurant.dto.RestaurantDto;
import com.example.demo.domain.restaurant.dto.RestaurantUpdateDto;
import com.example.demo.domain.restaurant.entity.Restaurant;
import com.example.demo.domain.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController

public class RestaurantController {
    private final RestaurantService restaurantService;
    @PostMapping("/api/restaurant/post")
    public Long create(@RequestBody RestaurantDto requestDto) {
        return restaurantService.create(requestDto);
    }

    @PutMapping("/api/restaurant/{id}")
    public Long update(@PathVariable Long id, @RequestBody RestaurantUpdateDto requestDto){
        return restaurantService.update(id, requestDto);
    }

}