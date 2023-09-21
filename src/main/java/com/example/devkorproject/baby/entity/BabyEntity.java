package com.example.devkorproject.baby.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BabyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long babyId;
}