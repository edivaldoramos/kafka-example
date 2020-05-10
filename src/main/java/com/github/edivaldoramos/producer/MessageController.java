package com.github.edivaldoramos.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer/messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageProducer producer;

    @PostMapping
    public ResponseEntity send(@RequestParam("message") String message){
        producer.send(message);
        return ResponseEntity.ok().build();
    }
}
