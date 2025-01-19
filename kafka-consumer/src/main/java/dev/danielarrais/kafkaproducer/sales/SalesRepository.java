package dev.danielarrais.kafkaproducer.sales;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends CrudRepository<SalesEntity, Integer> {
}
