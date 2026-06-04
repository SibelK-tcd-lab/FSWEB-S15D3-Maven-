package org.example;

import org.example.entity.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1L, "Ali", "Yilmaz"));
        employees.add(new Employee(1L, "Ali", "Yilmaz"));
        employees.add(new Employee(2L, "Ayse", "Demir"));
        employees.add(new Employee(2L, "Ayse", "Demir"));
        employees.add(new Employee(3L, "Mehmet", "Kaya"));
        employees.add(new Employee(4L, "Zeynep", "Polat"));

        System.out.println(findDuplicates(employees));
        System.out.println(findUniques(employees));
        System.out.println(removeDuplicates(employees));

        System.out.println(WordCounter.calculateWord());
    }

    // 1. DUPLICATES
    public static List<Employee> findDuplicates(List<Employee> list) {

        Map<Long, Integer> countMap = new HashMap<>();
        List<Employee> result = new LinkedList<>();

        for (Employee e : list) {
            countMap.put(e.getId(), countMap.getOrDefault(e.getId(), 0) + 1);
        }

        for (Employee e : list) {
            if (countMap.get(e.getId()) > 1) {
                result.add(e);
            }
        }

        return result;
    }

    // 2. UNIQUES (Map)
    public static Map<Long, Employee> findUniques(List<Employee> list) {

        Map<Long, Employee> map = new HashMap<>();

        for (Employee e : list) {
            map.putIfAbsent(e.getId(), e);
        }

        return map;
    }

    // 3. REMOVE DUPLICATES
    public static List<Employee> removeDuplicates(List<Employee> list) {

        Map<Long, Integer> countMap = new HashMap<>();
        List<Employee> result = new LinkedList<>();

        for (Employee e : list) {
            countMap.put(e.getId(), countMap.getOrDefault(e.getId(), 0) + 1);
        }

        for (Employee e : list) {
            if (countMap.get(e.getId()) == 1) {
                result.add(e);
            }
        }

        return result;
    }
}