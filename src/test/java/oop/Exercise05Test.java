package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    @Test
    public void test() {
        TestClass testClass = new TestClass();
        testClass.display();
        assertEquals(10, testClass.a);
    }
}
