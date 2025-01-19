package dev.danielarrais.kafkaproducer;

import org.springframework.boot.SpringApplication;

public class TestSpringAndKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.from(KafkaProducerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
