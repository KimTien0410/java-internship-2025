Annotation là gì, giải thích ý nghĩa của @Override, @Deprecated
=> Annotation được hiểu là một dạng chú thích hoặc một dạng siêu dữ liệu (metadata)
được dùng để cung cấp thông tin dữ liệu cho mã nguồn Java. Các Annotation được sử dụng 
trong mã nguồn sẽ được biên dịch thành bytecode và sử dụng kỹ thuật phản chiếu (Reflection)
để truy vấn thông tin siêu dữ liệu và đưa ra hành động thích hợp. Chúng ta có thể chú thích các
lớp (class), phương thức (method), biến (variable), các gói (package) và các tham số (parameter) trong Java.
- Java Annotation có hai loại:
+ Các Annotation được tích hợp sẵn.
+ Annotation do người dùng tự định nghĩa.

- @Override: Được sử dụng cho các phương thức có ý nghĩa là ghi đè một phương thức trong lớp cha (superclass).
Nếu một phương thức đánh dấu @Override không ghi đè chính xác một phương thức trong lớp Cha của nó hay hiểu đơn giản
là phương thức đó không tồn tại trong lớp cha thì trình biên dịch sẽ báo lỗi.

- @Deprecated: Đuợc sử dụng để đánh dấu một đối tượng (class, method hoặc field) và chỉ dẫn rằng nó tốt nhất không nên sử dụng nữa.
Trình biên dịch sẽ đưa các câu cảnh báo khi chương trình sử dụng các thuộc tính, lớp hoặc phương thức có gắn với @Deprecated.