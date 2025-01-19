package dev.danielarrais.kafkaproducer.sales;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SalesEventPublisher {
    private static final Logger log = LoggerFactory.getLogger(SalesEventPublisher.class);
    private final KafkaTemplate<String, String> kafkaTemplate;

    public SalesEventPublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) {
        var sendFuture = kafkaTemplate.send("sales-topic", message);

        sendFuture.whenComplete((r, e) -> {
            if (e != null) {
                log.error("Error sending message", e);
                return;
            }

            log.info("Message sent successfully, topic={}, message={}, offset={}",
                    "sales-topic",
                    message,
                    r.getRecordMetadata().offset());
        });
    }
}
