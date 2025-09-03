package oop;

public class Book extends Dictionary<String, String>{

    public Book(String key, String value) {
        super(key, value);
    }

}

class Demo{
    public static void main(String[] args) {
        Book book = new Book("ISBN12345", "Java Programming");
        System.out.println("Book Key: " + book.getKey());
        System.out.println("Book Value: " + book.getValue());
    }
}
