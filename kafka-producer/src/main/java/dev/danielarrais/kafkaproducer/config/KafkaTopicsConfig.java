package dev.danielarrais.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicsConfig {

    @Bean
    public NewTopic salesTopic() {
        return new NewTopic("sales-topic", 3, (short) 1);
    }
}
