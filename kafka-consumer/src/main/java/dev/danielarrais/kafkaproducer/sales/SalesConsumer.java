package dev.danielarrais.kafkaproducer.sales;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SalesConsumer {
    private static final Logger log = LoggerFactory.getLogger(SalesConsumer.class);

    @KafkaListener(topics = "sales-topic")
    public void listen(String message) {
        log.info("Consumer received: {}", message);
    }
}
