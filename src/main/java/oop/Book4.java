package oop;

public class Book4<K, V, I> extends Dictionary<K, V> {
    private I info;
    public Book4(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }
    public Book4(K key, V value) {
        super(key, value);
    }
    public I getInfo() {
        return info;
    }
    public void setInfo(I info) {
        this.info = info;
    }
}

class Demo4 {
    public static void main(String[] args) {
        Book4<String, String, Integer> book = new Book4<>("ISBN11223", "Design Patterns", 5);
        System.out.println("Book Key: " + book.getKey());
        System.out.println("Book Value: " + book.getValue());
        System.out.println("Book Info (Edition): " + book.getInfo());

        Book4<String, String, String> anotherBook = new Book4<>("ISBN44556", "Refactoring", "Second Edition");
        System.out.println("Another Book Key: " + anotherBook.getKey());
        System.out.println("Another Book Value: " + anotherBook.getValue());
        System.out.println("Another Book Info (Edition): " + anotherBook.getInfo());
    }
}
