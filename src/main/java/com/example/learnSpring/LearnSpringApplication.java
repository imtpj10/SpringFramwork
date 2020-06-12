package com.example.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {

		//What are beans
		//What are the dependencies for of a bean
		//Where to search for bean


		//Application context manages all beans

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {2,3,4,5},3);
		//System.out.println(result);
		ApplicationContext applicationContext =  SpringApplication.run(LearnSpringApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4,5,6},3);
		System.out.println(result);
	}
}
