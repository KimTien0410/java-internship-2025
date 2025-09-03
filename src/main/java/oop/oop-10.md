10. Anonymous class là gì, lúc nào thì ta nên dùng anonymous class?
=> Anonymous Class là một loại class trong Java, trong đó các class này không định nghĩa tên ở cú pháp,
tên của chúng chỉ được sinh ra do quá trình biên dịch mã nguồn.
- Anonymous Inner Class đơn giản là một lớp không có tên. Nó có thể được sử dụng khi phải thực hiện override một phương thức của lớp
hoặc interface. Anonymous Class trong Java có thể được tạo ra bằng hai cách sau:
+ Sử dụng class (abstract hoặc concrete)
+ Sử dụng interface

- Thay vì sử dụng extends class, Anonymous Class có ưu diểm riêng. Trong các trường hợp trên,
lớp Anonymous được viết ngay trong method của class khácm sử dụng ngay lúc định nghĩa xong. Do vậy nên sử dụng Anoymous khi đối tượng
ch được dùng một lần.
+ Anonymous phù hợp trong trường hợp cần tạo đối tượng con, trong đó method viết lại từ lớp cha là ít đơn giản
+ Tuy nhiên, Anonymous luôn luôn được thừa kế từ 1 lớp cha hoặc implement từ một interface. Vì không định nghĩa class cho mình,
nên Anonymous không có constructor để khởi tạo chính nó. Đây là nhược điểm của Anonymous. Mọi tham số truyền vào lúc khởi tạo 1 instance 
Anonymous luôn được truyền vào constructor của lớp cha để khởi tạo.
