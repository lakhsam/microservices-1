package me.ahmed.microservices.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ahmed.microservices.forex.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	
	ExchangeValue findByFromAndTo(String from, String to);
	
}