package com.example.spring_ai_with_local_llm.rag.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class RagApiController {
    
    @PostMapping("/public/rag")
    public Mono<String> postString(@RequestBody String string) {
    
    }
}
