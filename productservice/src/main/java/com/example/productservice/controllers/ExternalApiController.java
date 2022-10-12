package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {

	@RequestMapping("/weather")
	public String getWeather(@RequestParam("city") String city) {
		String url = "http://api.weatherstack.com/current?access_key=c6a5d53730875bc1679e8571e001115c&query="+city;
		RestTemplate restTemplate = new RestTemplate();
		String weatherData = restTemplate.getForObject(url, String.class);
		return weatherData;
	}
	
}

// ********
// http://localhost:8081/weather?city=bangalore
// use the above url in get to run