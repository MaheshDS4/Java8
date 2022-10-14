package com.ms.study.arrays;

import java.util.HashMap;

//Find max repetitive number
public class Problem1 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 7, 2, 5, 2, 3};
        HashMap<Integer, Integer> map = new HashMap<>();//Number, Count
        int maxRepeatNumber = 0;
        int count = Integer.MIN_VALUE;
        for (int number : arr) {
            if (map.containsKey(number)) { //Check number in map
                map.put(number, map.get(number) + 1); //Means number is there so increase the count
            } else {
                map.put(number, 1);//Number find for the first time
            }
            if (count < map.get(number)) { //Check if count in map is more than what we have in maxRepeatNumber
                count = map.get(number); //Now new count is from map
                maxRepeatNumber = number; //This is the max count number
            }
        }
        System.out.println("Number: " + maxRepeatNumber + ", Count: " + map.get(maxRepeatNumber));
    }
}
