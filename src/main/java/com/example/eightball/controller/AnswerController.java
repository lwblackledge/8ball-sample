package com.example.eightball.controller;

import com.example.eightball.service.AnswerService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

  @NonNull
  private final AnswerService answerService;

  // TODO: Add an endpoint to return an answer to a question
}
