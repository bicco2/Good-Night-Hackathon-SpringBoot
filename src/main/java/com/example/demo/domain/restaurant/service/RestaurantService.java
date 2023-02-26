package com.example.demo.domain.restaurant.service;

import com.example.demo.domain.restaurant.dto.RestaurantDto;
import com.example.demo.domain.restaurant.dto.RestaurantUpdateDto;
import com.example.demo.domain.restaurant.entity.Restaurant;
import com.example.demo.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Transactional
    public Long create(RestaurantDto restaurantDto) {
        return restaurantRepository.save(restaurantDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, RestaurantUpdateDto requestDto) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 레스토랑이 존재하지 않습니다."));

        restaurant.update(requestDto.getType());

        return id;
    }

}