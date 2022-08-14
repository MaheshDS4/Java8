package com.ms.study.stream;

import com.github.javafaker.Faker;
import lombok.extern.java.Log;

import java.util.*;
import java.util.stream.Collectors;

/**
 * find third highest salary employee using java 8
 */
@Log
public class Problem3 {
    public static void main(String[] args) {
        List<Employee> listEmployess = createEmployees();
        log.info("List of employee " + listEmployess);
        Optional<Integer> thirdSalary = listEmployess.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findAny();
        if (thirdSalary.isPresent()) {
            log.info("Third Highest Salary: " + thirdSalary.get());
        } else {
            log.info("No Record Found");
        }

    }

    public static List<Employee> createEmployees() {
        Faker faker = new Faker();
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee();
            emp.setName(faker.name().name());
            emp.setSalary(faker.number().numberBetween(1000, 5000));
            employeeList.add(emp);
        }
        return employeeList;
    }
}
