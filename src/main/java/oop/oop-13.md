13. Từ khoá instanceof dùng để làm gì?
> Toán tử instanceof trong Java được sử dụng để kiểm tra một đối tượng có phải là thể hiện của một kiểu dữ liệu cụ thể không (lớp, lớp con, interface).
> Instanceof trong java được gọi là toán tử so sánh kiểu vì nó so sánh thể hiện với kiểu dữ liệu. Nó trả về giá trị boolean là true hoặc false. Nếu bạn dùng toán tử instanceof với bất kỳ biến nào mà có giá trị null, giá trị trả về false.
> Ví dụ:
```java
public class Simple1 {
 public static void main(String args[]) {
  Simple1 s = new Simple1();
  System.out.println(s instanceof Simple1);// true
 }
}
```
> Một đối tượng có kiểu của lớp con thì cũng có kiểu của lớp cha. Ví dụ, nếu Dog kế thừa Animal thì đối tượng của Dog có thể tham chiếu đến cả hai lớp Dog và Animal.
> Ví dụ:
```java
class Animal {}
 
public class Dog extends Animal {// Dog inherits Animal
 
 public static void main(String args[]) {
  Dog dog = new Dog();
  System.out.println(dog instanceof Animal);// true
 }
}
```
> Instanceof trong java với biến có giá trị null: nếu bạn sử dụng toán tử instanceof với biến có bất kỳ có giá trị null th trả về luôn là null.
> Ví dụ:
```java
public class Dog2 {
 public static void main(String args[]) {
  Dog2 d = null;
  System.out.println(d instanceof Dog2);// false
 }
}
```
