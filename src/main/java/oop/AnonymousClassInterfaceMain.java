package oop;

public class AnonymousClassInterfaceMain {
    public static void main(String[] args) {
        Tester2 tester = new Tester2();
        tester.testInterface();
    }
}

interface Bird2{
    void fly();
}

class Tester2{
    public void testInterface() {
        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("Flying");
            }
        };
        bird.fly();
    }
}
