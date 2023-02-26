package com.example.demo.domain.restaurant.dto;


import com.example.demo.domain.Type.Type;
import com.example.demo.domain.restaurant.entity.Restaurant;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class RestaurantDto {
    private String name;
    private Type type;

    @Builder
    public RestaurantDto(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Restaurant toEntity() {
        return Restaurant.builder()
                .name(name)
                .type(type)

                .build();
    }
}