package com.example.demo.domain.restaurant.dto;

import com.example.demo.domain.Type.Type;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RestaurantUpdateDto {
    private Type type;

    @Builder
    public RestaurantUpdateDto(Type type) {
        this.type = type;
    }
}
