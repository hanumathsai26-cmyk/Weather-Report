package com.jsp.WeatherReportWebService.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.REPOSITORY.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository repository;
	
	
	public Weather insertWeather(Weather weather) {
		return repository.save(weather);
		
	}
	
	
	
}
