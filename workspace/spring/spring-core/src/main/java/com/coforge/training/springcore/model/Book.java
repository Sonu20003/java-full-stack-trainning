package com.coforge.training.springcore.model;

/**
 * Author    :Sonu.2
 * Date      :Sep 26, 2025
 * Time      :4:31:31 PM
 * Project   :spring-core
 */
//POJO class for DI using Constructors
public class Book {

	private int id;  
	private String name,author,publisher;  
	private int quantity;

	public void display() {
		System.out.println("********** Book Details ******************");
		System.out.println(id +" "+name+" "+author+" "+publisher+" "+quantity);
	}
}
