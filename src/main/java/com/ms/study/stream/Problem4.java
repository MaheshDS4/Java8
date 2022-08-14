package com.ms.study.stream;

import com.github.javafaker.Faker;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * convert List<List<String>> to List<String>
 */
@Log
public class Problem4 {
    public static void main(String[] args) {
        List<List<String>> got = new ArrayList<>();
        got.add(createCharacterNames());
        got.add(createCityNames());
        log.info("Input List: " + got);
        List<String> flatMapResult = got.stream().flatMap(Collection::stream).collect(Collectors.toList());
        log.info("After Flat Map: " + flatMapResult);
    }

    public static List<String> createCharacterNames() {
        Faker faker = new Faker();
        List<String> charactersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String str = faker.gameOfThrones().character();
            charactersList.add(str);
        }
        return charactersList;
    }

    public static List<String> createCityNames() {
        Faker faker = new Faker();
        List<String> charactersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String str = faker.gameOfThrones().city();
            charactersList.add(str);
        }
        return charactersList;
    }
}
