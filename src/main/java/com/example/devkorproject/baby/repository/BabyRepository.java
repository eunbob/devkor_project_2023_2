package com.example.devkorproject.baby.repository;
import com.example.devkorproject.baby.entity.BabyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BabyRepository extends JpaRepository<BabyEntity,Long> {
}
