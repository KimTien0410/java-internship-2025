package oop;

public class AnonymousClassAbstractMain {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.testAbstract();
    }

}
abstract class Bird{
    abstract void fly();
}

class Tester{
    public void testAbstract() {
        Bird bird = new Bird() {
            @Override
            void fly() {
                System.out.println("Flying");
            }
        };
        bird.fly();
    }
}
