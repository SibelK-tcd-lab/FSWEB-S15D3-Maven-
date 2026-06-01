package org.example;
import org.example.entity.Employee;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1L, "Ali", "Yılmaz"));
        employees.add(new Employee(2L, "Ayşe", "Demir"));
        employees.add(new Employee(1L, "Ali", "Yılmaz")); // duplicate
        employees.add(new Employee(3L, "Mehmet", "Kaya"));
        employees.add(new Employee(2L, "Ayşe", "Demir")); // duplicate
        employees.add(new Employee(4L, "Zeynep", "Polat"));

        System.out.println("DUPLICATES:");
        System.out.println(findDuplicates(employees));

        System.out.println("\nUNIQUES (Map):");
        System.out.println(findUniques(employees));

        System.out.println("\nNO DUPLICATES:");
        System.out.println(removeDuplicates(employees));
    }

    // 1. Duplicate olanları bul
    public static List<Employee> findDuplicates(List<Employee> list) {

        Map<Long, Integer> countMap = new HashMap<>();
        List<Employee> duplicates = new LinkedList<>();

        for (Employee e : list) {
            countMap.put(e.getId(), countMap.getOrDefault(e.getId(), 0) + 1);
        }

        for (Employee e : list) {
            if (countMap.get(e.getId()) > 1) {
                duplicates.add(e);
            }
        }

        return duplicates;
    }

    // 2. Unique + duplicate olanlardan sadece 1 tanesini Map'e koy
    public static Map<Long, Employee> findUniques(List<Employee> list) {

        Map<Long, Integer> countMap = new HashMap<>();
        Map<Long, Employee> result = new HashMap<>();

        for (Employee e : list) {
            countMap.put(e.getId(), countMap.getOrDefault(e.getId(), 0) + 1);
        }

        for (Employee e : list) {
            if (!result.containsKey(e.getId())) {
                result.put(e.getId(), e); // sadece 1 tane eklenir
            }
        }

        return result;
    }

    // 3. Duplicate olanları tamamen sil, sadece tekil olanları bırak
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