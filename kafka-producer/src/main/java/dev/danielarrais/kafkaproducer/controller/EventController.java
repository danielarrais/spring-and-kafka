package dev.danielarrais.kafkaproducer.controller;

import dev.danielarrais.kafkaproducer.sales.SalesEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
@RequestMapping("/producer")
public class EventController {
    private final SalesEventPublisher salesEventPublisher;

    public EventController(SalesEventPublisher salesEventPublisher) {
        this.salesEventPublisher = salesEventPublisher;
    }

    @PostMapping("/sales")
    public void produceSalesEvent(@RequestBody String event) {
        salesEventPublisher.send(event);
    }

    @PostMapping("/batch/sales")
    public void produceManySalesEvents(@RequestBody String event) {
        IntStream.range(0, 1000)
                .forEach(i -> salesEventPublisher.send(event));
    }
}
