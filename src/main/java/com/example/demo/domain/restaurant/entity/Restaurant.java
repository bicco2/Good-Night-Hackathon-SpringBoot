package com.example.demo.domain.restaurant.entity;

import com.example.demo.domain.Type.Type;
import com.example.demo.domain.review.entity.Review;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "restaurant_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private Type type;

    private LocalDateTime createdAt;

    private Boolean isDeleted;

    @OneToMany(mappedBy = "restaurant")
    private List<Review> reviews = new ArrayList<>();

    @Builder
    public Restaurant(String name, Type type) {
        this.name = name;
        this.type = type;
        this.isDeleted = false;
        this.createdAt = LocalDateTime.now();
    }

    public void update(Type type) {
        this.type = type;
    }

}
