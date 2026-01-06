package com.fintech.events.consumer;

import com.fintech.events.model.TransactionLog;
import com.fintech.events.repository.TransactionLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionConsumer {

    private final TransactionLogRepository repository;

    @KafkaListener(topics = "transactions-topic", groupId = "fintech-group")
    public void consume(TransactionLog event) {
        System.out.println("Received event from Kafka. Saving to MySQL...");
        repository.save(event);
    }
}
