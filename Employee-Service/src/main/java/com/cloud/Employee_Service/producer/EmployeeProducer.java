package com.cloud.Employee_Service.producer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "employee_topic";
	
	
	public EmployeeProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendEmployeeCreatedEvent(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
	
	public void sendEmployeeUpdatedEvent(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
	
	
}
