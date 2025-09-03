20. Bạn hiểu gì về DI và IOC ?
=> Dependency Injection (DI) là một mô hình lập trình và thiết kế phần mềm, không chỉ áp dụng cho Java mà còn cho nhiều ngôn ngữ khác.
Đây là phương pháp giúp giảm sự phụ thuộc giữa các thành phần < hoặc lớp> trong ứng dụng.
- Trong DI, các phụ thuộc của một đối tượng được tạo bên trong đối tượng đó mà được cung cấp từ bên ngoài. Cụ thể DI thường được thực hiện thông qua ba cách chính:
+ Constructor Injection: Phụ thuộc được cung cấp thông qua constructor của lớp.
+ Setter Injection: Phụ thuộc được cung cấp thông qua các phương thức setter.
+ Interface Injection: Phụ thuộc được cung cấp thông qua các phương thức của một interface mà lớp triển khai.

=> Inversion of Control (IoC) là một nguyên tắc thiết kế phần mềm trong đó việc kiểm soát luồng chương trình và quản lý các đối tượng được chuyển từ mã nguồn của ứng dụng sang một framework hoặc container bên ngoài.
-IOC thường đi kèm với DI, nơi các Dependency được quản lý v cung cấp bởi một framework hoặc container. Framework sẽ quản lý việc tạo và quản lý các đối tượng và phụ thuộc