package com.gc.Lab28.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.gc.Lab28.entity.WeatherResult;


@Controller
public class HomeController {
	RestTemplate rtemp = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView showCharacters() {
		HttpHeaders headers = new HttpHeaders();

		headers.add(HttpHeaders.USER_AGENT, "Testing");
		
		
		String url = "http://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		ResponseEntity<WeatherResult> home = rtemp.exchange(url, HttpMethod.GET, new HttpEntity<String>("parameters", headers), WeatherResult.class);
		System.out.println(home.getBody());
		return new ModelAndView("weatherF", "weather", home.getBody());	
	}
}
