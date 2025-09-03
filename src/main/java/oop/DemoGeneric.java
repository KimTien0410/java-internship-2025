package oop;

public class DemoGeneric {
    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new Dictionary<>(1, "One");
        System.out.println("Key: " + dictionary.getKey());
        System.out.println("Value: " + dictionary.getValue());
        dictionary.setValue("Uno");
        System.out.println("Updated Value: " + dictionary.getValue());

        Dictionary<String, String> dict2 = new Dictionary<>("A", "Apple");
        System.out.println("Key: " + dict2.getKey());
        System.out.println("Value: " + dict2.getValue());
    }
}
