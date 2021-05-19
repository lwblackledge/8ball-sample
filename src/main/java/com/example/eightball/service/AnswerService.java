package com.example.eightball.service;

import com.example.eightball.configuration.EightBallConfig;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnswerService {

  @NonNull
  private final MongoTemplate mongoTemplate;

  @NonNull
  private final EightBallConfig eightBallConfig;

  // TODO: Create a service method that returns a random answer with the type
  //  (e.g. affirmative / negative), and saves the returned answer to the mongo database
}
