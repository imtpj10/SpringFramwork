package com.example.learnSpring;


public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm ;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int key) {
        //sorting
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //searching
        return 3;
    }
}
