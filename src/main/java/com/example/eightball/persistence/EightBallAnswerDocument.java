package com.example.eightball.persistence;

import java.time.Instant;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@FieldNameConstants
public class EightBallAnswerDocument {

  @Id
  @Builder.Default
  private UUID id = UUID.randomUUID();

  @NonNull
  @Indexed
  private String question;

  @NonNull
  @Indexed
  private String answer;

  @Builder.Default
  private Instant created = Instant.now();
}
