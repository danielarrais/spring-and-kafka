package dev.danielarrais.springandkafka;

import org.springframework.boot.SpringApplication;

public class TestSpringAndKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringAndKafkaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
