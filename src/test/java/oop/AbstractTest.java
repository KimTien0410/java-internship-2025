package oop;

import org.junit.jupiter.api.Test;

public class AbstractTest {
    @Test
    void testDraw() {
//        Shape shape = new Shape(); // This line will cause a compilation error because Shape is abstract
        Shape shape = new Rectangle();
        shape.draw();
        shape.setColor(5);
        assert shape.color == 5;
        shape.printColor();
    }
}
