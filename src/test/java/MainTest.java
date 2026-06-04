import org.example.entity.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private LinkedList<Employee> employees;

    @BeforeEach
    void setUp() {

        employees = new LinkedList<>();

        employees.add(new Employee(1L, "Dogancan", "Kinik"));
        employees.add(new Employee(1L, "Dogancan", "Kinik"));
        employees.add(new Employee(2L, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2L, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3L, "Anil", "Ensari"));
        employees.add(new Employee(3L, "Anil", "Ensari"));
        employees.add(new Employee(4L, "Burak", "Cevizli"));
    }

    @Test
    void testEmployeeCorrectFields() {

        Employee e = employees.get(0);

        assertEquals(1L, e.getId());
        assertEquals("Dogancan", e.getName());
        assertEquals("Kinik", e.getSurname());
    }
}
