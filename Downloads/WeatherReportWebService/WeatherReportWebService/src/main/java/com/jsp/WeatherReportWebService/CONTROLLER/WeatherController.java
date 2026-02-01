package com.jsp.WeatherReportWebService.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.SERVICE.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	private WeatherService service;
	
	@PostMapping("/weather")
	public Weather storeWeatherReport(@RequestBody Weather weather) {
		return service.insertWeather(weather);
	}
}
