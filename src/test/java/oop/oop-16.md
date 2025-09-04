16. Từ khoá static dùng để làm gì, tại sao từ một static method, ta không thể truy cập được đến non-static method
=> Từ khoá static trong Java được sử dụng để khai báo các thành phần (biến, phương thức, khối) thuộc về lớp thay vì thuộc về đối tượng cụ thể của lớp đó.
Điều này có nghĩa là các thành phần static có thể được truy cập mà không cần phải tạo một thể hiện (instance) của lớp.
- Biến static: Chia sẻ chung giữa tất cả các thể hiện của lớp. Nếu một thể hiện thay đổi giá trị của biến static, tất cả các thể hiện khác sẽ thấy sự thay đổi này.
- Phương thức static: Có thể được gọi mà không cần tạo một thể hiện của lớp. Phương thức static chỉ có thể truy cập trực tiếp các biến và phương thức static khác trong cùng lớp.
- Khối static: Được sử dụng để khởi tạo các biến static khi lớp được tải vào bộ nhớ.
- Tại sao từ một static method, ta không thể truy cập được đến non-static method:
  - Phương thức static không thuộc về bất kỳ thể hiện cụ thể nào của lớp, trong khi phương thức non-static (instance method) thuộc về một thể hiện cụ thể.
  - Khi gọi một phương thức static, không có đối tượng nào được tạo ra, do đó không có ngữ cảnh (context) để truy cập các thành phần non-static.
  - Nếu một phương thức static cố gắng truy cập một phương thức non-static, nó sẽ không biết phải sử dụng thể hiện nào của lớp để gọi phương thức non-static đó, dẫn đến lỗi biên dịch.
  - Để truy cập một phương thức non-static từ một phương thức static, bạn cần phải tạo một thể hiện của lớp trước và sau đó gọi phương thức non-static thông qua thể hiện đó.