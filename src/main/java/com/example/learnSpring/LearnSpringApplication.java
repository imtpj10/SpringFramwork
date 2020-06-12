package com.example.learnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//what are beans
		//what are the dependencies for of a bean
		//where to search for bean


		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {2,3,4,5},3);
		System.out.println(result);
		//SpringApplication.run(LearnSpringApplication.class, args);
	}

}
