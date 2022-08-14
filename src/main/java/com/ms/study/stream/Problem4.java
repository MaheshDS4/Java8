package com.ms.study.stream;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * convert List<List<String>> to List<String>
 */
public class Problem4 {
    public static void main(String[] args) {
        List<List<String>> got = new ArrayList<>();
        got.add(createCharacterNames());
        got.add(createCityNames());
        System.out.println(got);
        List<String> flatMapResult = got.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatMapResult);
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
