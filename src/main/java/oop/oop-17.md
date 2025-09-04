17. Tìm hiểu và giải thích SOLID Principles
> Nguyên tắc **Single Responsibility Principle (SRP)** - Nguyên tắc đơn trách nhiệm:
 >>+ Mỗi lớp trong hệ thống chỉ nên chịu trách nhiệm cho một chức năng duy nhất. Điều này có nghĩa là một lớp chỉ nên có một lý do để thay đổi.
 >>+ Ví dụ: Một lớp `User` chỉ nên quản lý thông tin người dùng, không nên xử lý việc gửi email.<br/>

> Nguyên tắc **Open/Closed Principle (OCP)** - Nguyên tắc mở/đóng:
>> + Các thực thể phần mềm (lớp, module, hàm) nên được mở để mở rộng nhưng đóng để sửa đổi. Điều này có nghĩa là bạn có thể thêm chức năng mới mà không cần thay đổi mã nguồn hiện có.
>> + Ví dụ: Sử dụng kế thừa hoặc giao diện để thêm các loại mới mà không cần sửa đổi lớp gốc.

> - Nguyên tắc **Liskov Substitution Principle (LSP)** - Nguyên tắc thay thế Liskov:
>> + Các đối tượng của lớp con nên có thể thay thế cho các đối tượng của lớp cha mà không làm thay đổi tính đúng đắn của chương trình. Điều này đảm bảo rằng lớp con tuân thủ các hợp đồng đã được định nghĩa bởi lớp cha.
>> + Ví dụ: Nếu bạn có một lớp `Bird` và một lớp con `Penguin`, thì `Penguin` không nên ghi đè các phương thức của `Bird` theo cách làm thay đổi hành vi mong đợi.

> - Nguyên tắc **Interface Segregation Principle (ISP)** - Nguyên tắc phân tách giao diện:
>> + Các giao diện nên được thiết kế sao cho các lớp chỉ cần triển khai những phương thức mà chúng thực sự sử dụng. Điều này giúp tránh việc các lớp phải triển khai các phương thức không cần thiết.
>> + Ví dụ: Thay vì có một giao diện lớn `Animal` với nhiều phương thức, bạn có thể chia nó thành các giao diện nhỏ hơn như `Flyable`, `Swimmable`, v.v.

> - Nguyên tắc **Dependency Inversion Principle (DIP)** - Nguyên tắc đảo ngược phụ thuộc:
>> + Các mô-đun cấp cao không nên phụ thuộc vào các mô-đun cấp thấp. Cả hai nên phụ thuộc vào các trừu tượng (giao diện hoặc lớp trừu tượng). Điều này giúp giảm sự phụ thuộc chặt chẽ giữa các thành phần trong hệ thống.
>> + Ví dụ: Thay vì một lớp `Order` trực tiếp tạo ra một đối tượng `Payment`, nó nên phụ thuộc vào một giao diện `PaymentMethod` mà các lớp cụ thể như `CreditCardPayment` hoặc `PayPalPayment` triển khai.