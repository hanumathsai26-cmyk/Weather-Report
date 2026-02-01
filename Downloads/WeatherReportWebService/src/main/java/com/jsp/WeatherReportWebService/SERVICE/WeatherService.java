package com.jsp.WeatherReportWebService.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.REPOSITORY.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	WeatherRepository repository;
	
	// to insert or store an object into DB
	public Weather insertWeather(Weather weather) {
		return repository.save(weather);
	}
	
	public Weather getWeatherById(int id) {
		Optional<Weather> opt = repository.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}
	
	public String deleteWeatherById(int id) {
		Weather w = getWeatherById(id);
		if(w != null) {
			repository.delete(w);
			// repository.deleteById(id);
			// repository.deleteAll();
			return "Weather report is deleted.";
		}
		return "Weather ID doesnt exist.";
	}
	
	public String updateWeatherById(int id , String condt) {
		Weather w = getWeatherById(id);
		if(w != null) {
			w.setConditions(condt);
			repository.save(w);
			return "Updation done";
		}
		return "ID doesnt exist.";
	}
	
	public List<Weather> getAllWeather() {
		return repository.findAll();
	}
	
	public List<Weather> getAllWeatherByCity(String city) {
		return repository.findByCity(city);
	}
	
	public String updateWeatherByTemperature(String condt , String temp) {
		int rows = repository.updateByTemperature(condt, temp);
		if(rows == 0) {
			return "updation not done.";
		}
		else {
			return "updation done.";
		}
	}
}
					
			







