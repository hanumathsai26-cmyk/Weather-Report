package com.jsp.WeatherReportWebService.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.SERVICE.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService service;
	
	@PostMapping("/weather")
	public Weather saveWeatherReport(@RequestBody Weather weather) {
		return service.insertWeather(weather);
	}
	
	@GetMapping("/weather")
	public Weather findWeatherReportById(@RequestParam int id) {
		return service.getWeatherById(id);
	}
	
	@DeleteMapping("/weather")
	public String deleteWeatherReport(@RequestParam int id) {
		return service.deleteWeatherById(id);
	}
	
	@PutMapping("/weather")
	public String updateWeather(@RequestParam int id , @RequestParam String condt) {
		return service.updateWeatherById(id, condt);
	}
	
	@GetMapping("/bycity")
	public List<Weather> allWeatherByCity(@RequestParam String city) {
		return service.getAllWeatherByCity(city);
	}
	
	@PutMapping("/bytemp")
	public String update(@RequestParam String condt , @RequestParam String temp) {
		return service.updateWeatherByTemperature(condt, temp);
	}
}















