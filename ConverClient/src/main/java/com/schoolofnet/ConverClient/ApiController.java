package com.schoolofnet.ConverClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/convert/{temp}")
	public String convert(@PathVariable Double temp) {
		Double fahrenheit = restTemplate.getForObject("http://fahrenheit-service/fahrenheit/{temp}", Double.class, temp);
		Double kelvin = restTemplate.getForObject("http://kelvin-service/kelvin/{temp}", Double.class, temp);
		return "Fahrenheit: " + fahrenheit + " Kelvin: " + kelvin;
	}
}