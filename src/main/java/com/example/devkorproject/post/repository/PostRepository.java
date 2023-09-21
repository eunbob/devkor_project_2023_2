package com.example.devkorproject.post.repository;

import com.example.devkorproject.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
