package com.example.devkorproject.customer.repository;

import com.example.devkorproject.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustromerRepository extends JpaRepository<CustomerEntity,Long> {
}
