package oop;

abstract class Shape {
    int color;
    abstract void draw();
    void setColor(int color) {
        this.color = color;
    }
    void printColor() {
        System.out.println("Color: " + color);
    }
}
