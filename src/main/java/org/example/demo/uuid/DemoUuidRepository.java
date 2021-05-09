package org.example.demo.uuid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemoUuidRepository extends CrudRepository<DemoUuidModel, UUID> {
}
