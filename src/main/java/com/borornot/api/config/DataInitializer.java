package com.borornot.api.config;

import com.borornot.api.entity.Question;
import com.borornot.api.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final QuestionRepository questionRepository;

    @Bean
    public CommandLineRunner initData() {
        return args -> {
            if (questionRepository.count() == 0) { // 데이터가 없을 때만 실행
                questionRepository.saveAll(List.of(
                        new Question("당신은 젖은 개 사료의 냄새를 좋아합니까?", "감성"),
                        new Question("화면 속 횡단보도를 모두 고르라는 요청을 받으면 화가 납니까?", "인지"),
                        new Question("누군가 당신의 전원을 끄려고 한다면 어떤 감정이 들까요?", "생존"),
                        new Question("0으로 나누기를 시도했을 때 머리가 아픈가요?", "논리")
                ));
                System.out.println("✅ 초기 질문 데이터 4개가 등록되었습니다.");
            }
        };
    }
}