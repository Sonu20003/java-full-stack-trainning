package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Student;

/**
 * Author    :Sonu.2
 * Date      :Sep 26, 2025
 * Time      :4:22:52 PM
 * Project   :spring-core
 */

public class StudentApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		
		Student s1 = (Student) context.getBean("student1");
		Student s2 = (Student) context.getBean("student2");
		
		System.out.println("***************** Student Details *****************");
		System.out.println(s1);
		System.out.println(s2);

	}

}
