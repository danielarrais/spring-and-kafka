package dev.danielarrais.kafkaproducer.sales;

import org.springframework.stereotype.Service;

@Service
public class SalesCreateService {
    private final SalesRepository salesRepository;

    public SalesCreateService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    public void create(SalesEntity salesEntity) {
        salesRepository.save(salesEntity);
    }
}
