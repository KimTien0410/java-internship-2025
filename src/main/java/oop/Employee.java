package oop;

public class Employee extends People {
    private String employeeId;
    private String department;
    private double salary;

    public Employee(String name, String address, int age, String employeeId, String department, double salary) {
        super(name, address, age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
}
