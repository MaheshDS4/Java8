package com.ms.study.stream;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * find the string with character starting with M using java 8
 */
@Log
public class Problem2 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Mac", "Max", "John", "Jacob");
        List<String> result = nameList.stream()
                .filter(name -> name.startsWith("M"))
                .collect(Collectors.toList());
        log.info("Names starts with M: " + result);
    }
}
