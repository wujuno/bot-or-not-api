package com.borornot.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "tb_questions") // DB에 생성될 테이블 이름
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content; // 질문 내용

    private String category; // 질문 카테고리

    public Question(String content, String category) {
        this.content = content;
        this.category = category;
    }
}