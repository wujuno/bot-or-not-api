package com.borornot.api.controller;

import com.borornot.api.entity.Question;
import com.borornot.api.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor // Repository 주입을 위해 사용합니다.
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping
    public List<Question> getAllQuestions() {
        // 별도의 쿼리 작성 없이 findAll()만 호출하면 DB의 모든 데이터를 가져옵니다.
        return questionRepository.findAll();
    }
}