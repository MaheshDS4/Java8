package com.ms.study.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * find the duplicate character count using java 8
 * */
public class Problem1 {

    public static void main(String[] args) {
        String name = "Mahesh";
        Map<Character, Long> result = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("{Char: Count}: " + result);
    }
}
