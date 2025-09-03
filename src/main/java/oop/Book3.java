package oop;

public class Book3<V> extends Dictionary<String, V> {
    public Book3(String key, V value) {
        super(key, value);
    }
}

class Demo3 {
    public static void main(String[] args) {
        Book3<String> book = new Book3<>("ISBN67890", "Clean Code");
        System.out.println("Book Key: " + book.getKey());
        System.out.println("Book Value: " + book.getValue());
    }
}
