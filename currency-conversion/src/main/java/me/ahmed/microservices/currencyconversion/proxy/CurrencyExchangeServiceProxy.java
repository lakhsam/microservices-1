package me.ahmed.microservices.currencyconversion.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import me.ahmed.microservices.currencyconversion.dto.CurrencyConversionDto;

@FeignClient(name = "forex-service", url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionDto retrieveExchangeValue(@PathVariable("from") String from,
			@PathVariable("to") String to);
}
