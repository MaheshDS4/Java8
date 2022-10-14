package com.ms.study.arrays;

import java.util.Comparator;
import java.util.stream.IntStream;

//Find second max number
public class Problem2 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 7, 2, 5, 2, 3};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        int secondMaxWithStream = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Max Number: " + secondMax);
        System.out.println("Stream Second Max Number: " + secondMaxWithStream);
    }
}
