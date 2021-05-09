package org.example.demo.string;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Table("demo_string")
public class DemoStringModel implements Persistable<UUID> {

  @Id
  private final UUID id;

  private final List<String> entities;

  public DemoStringModel(UUID id, List<String> entities) {
    this.id = id;
    this.entities = entities;
  }

  @Override
  public UUID getId() {
    return id;
  }

  public List<String> getEntities() {
    return entities;
  }

  @Override
  public boolean isNew() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DemoStringModel demoModel = (DemoStringModel) o;
    return id.equals(demoModel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
