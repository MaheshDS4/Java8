package com.ms.study.arrays;

/*
 * Print n number without using loop
 * */
public class Problem4 {

    public static void printNumber(int n) {
        if (n > 0) {
            printNumber(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        printNumber(10);
    }
}
