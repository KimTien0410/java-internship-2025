18. Tìm hiểu, giải thích Design Pattern là gì và giải thích mục đích/ý nghĩa của vài pattern (tuỳ chọn)
> **Design Pattern** là một giải pháp có thể tái sử dụng để xử lý các vấn đề diễn ra trong thiết kế phần mềm. Chúng thực ra giống như hình mẫu hoặc khuôn mẫu rằng bạn có thể áp dụng (customize) và sử dụng để giải quyết một thiết kế cụ thể trong code của bạn<br/>
> Bản thân chúng không phải là mã, chúng mô tả cách tốt nhất rằng có thể áp dụng để giải quyết vấn đề thường xuyên diễn ra trong thiết kế phần mềm đặc biệt trong lập trình hướng đối tượng trong Java.<br/><br/>
> **Lợi ích của Design Pattern**:
> - Tăng tính tái sử dụng(Reusability): Những giải pháp có thể áp dụng lại trong nhiều vấn đề giống nhau thông qua các dự án khác nhau.
> - Giao tiếp tốt hơn(Communication): Cung cấp một từ vựng chung cho lập trình viên
> - Luyện tập tốt nhất(Best Practices): Sử dụng các giải pháp đã được kiểm chứng (proven) và tiêu chuẩn coding (coding standards)
> - Dễ bảo trì(Mainntainability): Giúp code có tổ chức và dễ để chỉnh sửa.(Make code more organized and easier to modify)
> - Linh hoạt(Flexibility): Cho phép dễ áp dụng để thay đổi các yêu cầu.(Allows for easier adaptation to changing requirements).
> **Tại sao nên học Design Pattern trong Java**:
> - Bản chất (nature) lập trình hướng đối tượng trong Java làm nó hoàn hảo để áp dụng các Design Pattern.
> - Sử dụng trong các Framework như Spring, Hibernate, và Java Collections.
> - Giúp trong việc phỏng vấn và phát triển phần mềm quy mô lớn (large - scale).
>> **Type of Design Patern**:
> - **Creational Patterns**: Những khuôn mẫu giải quyết các vấn đề liên quan đến việc tạo đối tượng, cố gắng(trying to) tạo một đối tượng trong một cách phù hợp với tình huống. Nó giúp làm một hệ thống độc lập với cách nó tao đối tượng, composed( sáng tác, bình tĩnh), và represented(đại diện). Ví dụ: Singleton, Factory Method, Abstract Factory, Builder, Prototype.
> - **Structural Patterns**: Những khuôn mẫu giải quyết thành phần(cữaomposition) đối tượng và mối quan hệ giữa các đối tượng. Họ giúp nó làm dễ để cấu trúc(structure) các classes và đối tượng trong một cách làm duy trì code đơn giản(simplifeies code maintenance) và cải thiện độ linh hoạt(improves flexibility). Ví dụ: Adapter, Decorartor, Facade, Composite.
> - **Behavioral Patterns**: Những khuôn mẫu tập trung vào giao tiếp giữa các đối tượng và phân công trách nhiệm (assignment of responsibilities). Chúng giúp quản lý cách đi tượng tương tác trong một hệ thống, làm nó hiệu quả và dễ dàng để chỉnh sửa (easier to modify). Ví dụ: Observer, Strategy, Command, Template Method.
>
> **Design Pattern phổ biến trong Java**:
> - **Singleton Pattern (Creational)**: đảm bảo rằng một lớp chỉ có duy nhất một thể hiện và cung cấp truy cấp toàn cầu đến nó(provides global access to it). Nó cho phép tạo đối tượng để tránh nhiều thể hiện và đảm bảo rằng luôn luôn (consistent) truy cập để chia sẻ tài nguyên.
<br/> **Khi nào sử dụng (when to use)**: Khi bạn cần chính xác một thể hiện của một class (ví dụ: Kết nối database connection , logger).
<br/>**Ví dụ (example)**:
```java
class Singleton {
    // Private static instance
    private static Singleton instance;
    
    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code
    }
    
    // Public method to get the instance. If instance is not null, new will not be initialized.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        s1.displayMessage();
        System.out.println(s1 == s2); // true - same instance
    }
}
```
> - **Factory Method Pattern (Creational)**: tạo đối tượng với không cần phải chỉ định chính xác lớp của chúng, thúc đẩy(promoting) loose coupling. Nó đóng gói(encapsulate) việc tạo đối tượng đúng logic, làm cide dễ bảo trì v mở rộng (scalable).<br/>
   **When to use**: Khi bạn cần tạo đối tượng dựa trên điều kiện hoặc các tham số(parameters) chắc chắn(certain).<br/> 
   **Example**:
```java
// Product interface
interface Animal {
    void makeSound();
}

// Concrete products
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Factory class
class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type");
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");
        
        dog.makeSound(); // Woof!
        cat.makeSound(); // Meow!
    }
}
```
> - **Observer Pattern (Behavioral)**: Định nghĩa sự phụ thuộc một nhiều giữa các đối tượng vì vậy khi một đối tượng thay đổi tình trạng, tất cả sự phụ thuộc là được thông báo tự động.
<br/>**When to use**: Khi thay đổi một đối tượng yêu cầu cập nhật nhiều đối tượng phụ thuộc.
<br/>**Example**:
```java
import java.util.*;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Concrete Subject
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    
    public void setNews(String news) {
        this.news = news;
        notifyObservers(news);
    }
}

// Concrete Observer
class NewsChannel implements Observer {
    private String name;
    
    public NewsChannel(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        
        NewsChannel channel1 = new NewsChannel("CNN");
        NewsChannel channel2 = new NewsChannel("BBC");
        
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        
        agency.setNews("Breaking: New Java version released!");
    }
}
```
> - **Strategy Pattern(Behavioral)**: định nghĩa một gia đình(family) của các thuật toán, đóng gói một một và làm chúng có thể hoán đổi cho nhau(interchangable).<br/>
    **When to use**: Khi bạn có nhiều thuật toán cho một nhiệm vụ cụ thể và muốn chọn một trong số chúng tại runtime.<br/>
    **Example**:
```java
import java.util.*;

// Strategy interface
interface SortingStrategy {
    void sort(int[] array);
}

// Concrete strategies
class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Bubble Sort");
        // Implementation would go here
        Arrays.sort(array); // Using built-in for simplicity
    }
}

class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using Quick Sort");
        // Implementation would go here
        Arrays.sort(array); // Using built-in for simplicity
    }
}

// Context class
class SortingContext {
    private SortingStrategy strategy;
    
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void executeStrategy(int[] array) {
        strategy.sort(array);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1, 9};
        SortingContext context = new SortingContext();
        
        // Use bubble sort
        context.setStrategy(new BubbleSort());
        context.executeStrategy(data);
        
        // Switch to quick sort
        context.setStrategy(new QuickSort());
        context.executeStrategy(data);
    }
}
```
```from geeksforgeeks.org :```<a href="https://www.geeksforgeeks.org/system-design/design-patterns-in-java/">Design Pattern - GeeksforGeeks</a>



