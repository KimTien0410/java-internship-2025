package oop;

public class Book2<K, V> extends Dictionary<K, V> {
    public Book2(K key, V value) {
        super(key, value);
    }
}

class Demo2{
    public static void main(String[] args) {
        Book2<Integer, String> book = new Book2<>(1001, "Effective Java");
        System.out.println("Book Key: " + book.getKey());
        System.out.println("Book Value: " + book.getValue());
    }
}
