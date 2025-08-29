package oop;

public class Student  extends People {
    private String studentId;
    private String major;

    public Student(String name, String address, int age, String studentId, String major) {
        super(name, address, age);
        this.studentId = studentId;
        this.major = major;
    }

}
