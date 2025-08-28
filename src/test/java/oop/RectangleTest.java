package oop;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(5, 10);
        assert rectangle.getWidth() == 5;
        assert rectangle.getHeight() == 10;
        assert rectangle.getArea() == 50;
        assert rectangle.getPerimeter() == 30;

        rectangle.setWidth(7);
        rectangle.setHeight(14);
        assert rectangle.getWidth() == 7;
        assert rectangle.getHeight() == 14;
        assert rectangle.getArea() == 98;
        assert rectangle.getPerimeter() == 42;
    }
}
