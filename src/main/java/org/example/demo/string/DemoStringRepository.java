package org.example.demo.string;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemoStringRepository extends CrudRepository<DemoStringModel, UUID> {
}
