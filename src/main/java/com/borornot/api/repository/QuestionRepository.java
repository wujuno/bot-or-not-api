package com.borornot.api.repository;

import com.borornot.api.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

// <엔티티 타입, ID 타입>을 적어줍니다.
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
