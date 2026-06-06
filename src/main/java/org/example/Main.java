package org.example;

import org.example.entity.Employee;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // İsteğe bağlı olarak konsol testi için burası kullanılabilir.
    }

    // findDuplicates: Tekrar eden elemanları bulur (null güvenli)
    public static List<Employee> findDuplicates(List<Employee> list) {
        Set<Employee> uniques = new HashSet<>();
        Set<Employee> duplicates = new HashSet<>();

        for (Employee emp : list) {
            if (emp != null) {
                if (!uniques.add(emp)) {
                    duplicates.add(emp);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }

    // findUniques: Her elemandan sadece bir tane barındıran Map döner (null güvenli)
    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> uniqueMap = new HashMap<>();
        for (Employee emp : list) {
            if (emp != null) {
                uniqueMap.put(emp.getId(), emp);
            }
        }
        return uniqueMap;
    }

    // removeDuplicates: Birden fazla kez geçen elemanların hepsini siler, sadece 1 kez geçenleri döner
    public static List<Employee> removeDuplicates(List<Employee> list) {
        Map<Employee, Integer> countMap = new HashMap<>();

        // Frekans sayımı
        for (Employee emp : list) {
            if (emp != null) {
                countMap.put(emp, countMap.getOrDefault(emp, 0) + 1);
            }
        }

        List<Employee> resultList = new ArrayList<>();
        // Sadece listede 1 kere geçenleri ekle
        for (Employee emp : list) {
            if (emp != null && countMap.get(emp) == 1) {
                resultList.add(emp);
            }
        }
        return resultList;
    }
}