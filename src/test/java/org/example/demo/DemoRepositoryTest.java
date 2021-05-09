package org.example.demo;

import org.example.demo.string.DemoStringModel;
import org.example.demo.string.DemoStringRepository;
import org.example.demo.uuid.DemoUuidModel;
import org.example.demo.uuid.DemoUuidRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
class DemoRepositoryTest {

  @Autowired
  private DemoUuidRepository demoUuidRepository;
  @Autowired
  private DemoStringRepository demoStringRepository;

  @Test
  void shouldInsertUuidModel() {
    final var model = new DemoUuidModel(UUID.randomUUID(), List.of(UUID.randomUUID()));

    var result = demoUuidRepository.save(model);

    Assertions.assertEquals(model, result);
  }

  @Test
  void shouldInsertStringModel() {
    final var model = new DemoStringModel(UUID.randomUUID(), List.of(UUID.randomUUID().toString()));

    var result = demoStringRepository.save(model);

    Assertions.assertEquals(model, result);
  }


}