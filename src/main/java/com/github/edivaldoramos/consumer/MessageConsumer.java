package com.github.edivaldoramos.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageConsumer {
    @KafkaListener(topics = "${test.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String message) {
        log.info("CONSUMER OUTPUT");
        log.info("Message: " + message);
    }

    @KafkaListener(topics = "${test.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(ConsumerRecord consumerRecord) {
        log.info("CONSUMER OUTPUT");
        log.info("key: " + consumerRecord.key());
        log.info("Headers: " + consumerRecord.headers());
        log.info("Partion: " + consumerRecord.partition());
        log.info("Message: " + consumerRecord.value());
    }
}
