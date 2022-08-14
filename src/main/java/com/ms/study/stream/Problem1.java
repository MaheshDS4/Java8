package com.ms.study.stream;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * find the duplicate character count using java 8
 * */
@Log
public class Problem1 {

    public static void main(String[] args) {
        String name = "Mahesh";
        Map<Character, Long> result = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        log.info("Duplicate Character with Count: " + result);
    }
}
