package com.coforge.training.springcore.model;

/**
 * Author    :Sonu.2
 * Date      :Sep 26, 2025
 * Time      :4:44:17 PM
 * Project   :spring-core
 * Bean class for DI using Annotation Config
 */

public class Airline {
	private String name;
	private int code;
	private String country;
	public Airline(String name, int code, String country) {
		super();
		this.name = name;
		this.code = code;
		this.country = country;
	}
	public void display() {
		System.out.println("Airline [name=" + name + ", code=" + code + ", country=" + country + "]");
	}  
	
	
}
