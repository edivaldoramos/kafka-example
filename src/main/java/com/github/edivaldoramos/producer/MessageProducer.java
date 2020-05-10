package com.github.edivaldoramos.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class MessageProducer {
    @Value("${test.topic}")
    private String testTopic;
    private final KafkaTemplate kafkaTemplate;

    public void send(String message){
        log.info("PRODUCER OUTPUT");
        log.info("Message to be sent: {}", message);

        final String mensageKey = UUID.randomUUID().toString();
        kafkaTemplate.send(testTopic, mensageKey, message);
    }
}
