package vn.tinhh.consumer1stdemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "demo-group")
    public void listen(String message) {
        System.out.println("🔥 Đã nhận message từ Kafka: " + message);
    }
}
