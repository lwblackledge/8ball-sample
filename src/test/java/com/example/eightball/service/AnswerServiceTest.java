package com.example.eightball.service;

import com.example.eightball.configuration.EightBallConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
public class AnswerServiceTest {

  @Mock
  private MongoTemplate mongoTemplate;

  @Autowired
  private EightBallConfig eightBallConfig;

  private AnswerService answerService;

  @BeforeEach
  public void setUp() {
    answerService = new AnswerService(mongoTemplate, eightBallConfig);
  }

  @Test
  public void testAnswer() {
    // TODO: create a test that calls the answer service random answer generator
  }
}
