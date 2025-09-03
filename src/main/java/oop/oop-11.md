11. Generic là gì, sử dụng generic có tác dụng gì
=> Generic được hiểu là tham số hoá kiểu dữ liệu. Việc tham số hoá kiểu dữ liệu giúp cho dân lập trình viên 
có thể dễ bắt lỗi các kiểu dữ liệu không hợp lệ, đồng thời giúp dễ dàng hơn cho việc tạo và sử dụng các class,
interface, method ới nhiều kiểu dữ liệu khác nhau.

- Một số quy ước trong generics:
Có rất nhiều cách để đặt tên cho kiểu tham số trong Generic nhưng chúng ta nên tuân theo nhưng kiểu đặt tên tiêu chuẩn để 
sau này có làm việc nhóm thì dễ đọc code hơn.
- Các kiểu tham số thông thường :
+ T - Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float...)
+ E - Element (Phần tử - được sử dụng phổ biến trong Collection Framework)
+ K - Key (Khoá - được sử dụng phổ biến trong Map)
+ V - Value (Giá trị - được sử dụng phổ biến trong Map)
+ N - Number (Kiểu số - thuộc các lớp Number: Integer, Long, Float, Double...)
+ U, S, I, G...: Các kiểu tham số bổ sung khi có nhiều hơn một kiểu tham số

- Các kiểu Generic:
* Tạo class Generic với kiểu tham số generic:
+ Dictionary<K, V> là một class Generics nó chứa một cặp khoá và giá trị (key/ value).
 ** K và V được gọi là 1 kiểu tham số chiếu nào đó của Dictionary<K,V>. Khi sử dụng class này chúng ta 
    phải xác định 1 kiểu tham số cụ thể.
* Thừa kế lớp Generic:
 Một class kế thừa từ một class Generics, nó có thể quy định kiểu cho tham số Generics,
giữ nguyên các tham số Generics hoặc thm các tham số Generics 
 ** Các quy định kiểu cho tham số Generics: class Book 
 ** Các quy định giữ nguyên các tham số generic: class Book2, class Book3
 ** Cách thêm các tham số Generics vào 1 class Generic khác:
    tạo 1 class con kế thừa Dictionary<K,V> sau đó thêm tham số I vào: class Book4<K,V,I> extends Dictionary<K,V>

- Tác dụng của Generic:
* Tái sử dụng code: Chỉ viết một lần, dùng cho nhiều kiểu dữ liệu khác nhau.
 Ví dụ List<T> có thể là List<String>, List<Integer>...
* An toàn về kiểu dữ liệu: Tránh lỗi ép kiểu sai lúc runtime vì generic kiểm tra ở compile time.
* Giảm ép kiểu (casting): Nếu không dùng generic, ta phải ép kiểu thử công. Với generic thì không cần.


- Một số generic phổ biến trong Java:
+ List<T>, Set<T>, Map<K,V> trong Collection Framework.
+ Optional<T> để đại diện cho giá trị có thể có hoặc không.
+ Comparable<T>, Comparator<T> để so sánh các đối tượng.