package com.schoolofnet.FahrenheitClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FahrenheitServiceController {
	
	@RequestMapping("/fahrenheit/{temp}")
	public Double convertCelsiusToFahrenheit(@PathVariable Double temp) {
		Double fahrenheit = (temp * 9/5) + 32;
		return fahrenheit;
	}
}
