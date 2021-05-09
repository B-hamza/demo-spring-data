package org.example.demo.uuid;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Table("demo")
public class DemoUuidModel implements Persistable<UUID> {

  @Id
  private final UUID id;

  private final List<UUID> entities;

  public DemoUuidModel(UUID id, List<UUID> entities) {
    this.id = id;
    this.entities = entities;
  }

  @Override
  public UUID getId() {
    return id;
  }

  public List<UUID> getEntities() {
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
    DemoUuidModel demoUuidModel = (DemoUuidModel) o;
    return id.equals(demoUuidModel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
