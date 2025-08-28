package oop;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void testCar() {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
