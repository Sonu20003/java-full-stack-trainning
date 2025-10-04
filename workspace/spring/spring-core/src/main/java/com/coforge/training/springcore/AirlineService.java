package com.coforge.training.springcore;

import org.springframework.stereotype.Component;

import com.coforge.training.springcore.model.Airline;

/**
 * Author    :Sonu.2
 * Date      :Sep 26, 2025
 * Time      :4:51:32 PM
 * Project   :spring-core
 */

@Component
public class AirlineService {
	
	public Airline getSimpleAirline() {
		return new Airline("Air India", 101, "India");
	}
}
