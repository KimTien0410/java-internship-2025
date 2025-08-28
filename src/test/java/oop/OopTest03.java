package oop;

import org.junit.jupiter.api.Test;

public class OopTest03 {

    @Test
    void testPeopleCreation() {
        People person = new People("Bob", "456 Elm St", 30);
    }

    @Test
    void testStudentCreation() {
        Student student = new Student("Alice", "123 Main St", 20, "S12345", "Computer Science");
    }


    @Test
    void testEmployeeCreation() {
        Employee employee = new Employee("David", "101 Pine St", 35, "E54321", "Engineering", 75000);
    }
}
