package com.springframework.dependencychecking.objects.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Student student = (Student) applicationContext.getBean("s");

		student.getStudent(); // Call Method By Object

	}

}
