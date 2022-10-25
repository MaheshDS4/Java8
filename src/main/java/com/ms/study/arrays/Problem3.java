package com.ms.study.arrays;

import java.util.LinkedList;

/**
 * Segregate 0s and 1s in an array
 */
public class Problem3 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 0};
        for (int i : segregateTheArray(arr)) {
            System.out.print(i + " ");
        }
        System.out.println(segregateUsingLinkedListTheArray(arr));
    }

    public static LinkedList<Integer> segregateUsingLinkedListTheArray(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int val : arr) {
            if (val == 0)
                list.addFirst(val);
            else
                list.addLast(val);
        }
        return list;
    }

    public static int[] segregateTheArray(int[] arr) {
        int[] result = new int[arr.length];

        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (arr[i] == 0) {
                result[i] = 0;
                count++;
            }
        }

        for (int i = count; i < arr.length; i++) {
            result[i] = 1;
        }
        return result;
    }
}
