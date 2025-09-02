6. So sánh sự khác biệt giữa class, abstract class và interface trong Java?
Đặc đềm                   --- Class          --- Abstract Class --- Interface
Có thể khởi tạo đối tượng --- Có thể         --- Không thể     --- Không thể
Có constructor            --- Có thể         --- Có thể        --- Không thể
Có phương thức trừu tượng --- Không          --- Có thể        --- Có thể (Mặc định)
Có phương thức có thân hàm --- Có thể        --- Có thể        --- (default, static,từ Java 8 trở đi)
Kế thừa                   --- Kế thừa đơn    --- Kế thừa đơn   --- Kế thừa đa (implements nhiều interface)
Chứa thuộc tính instance  --- Có thể         --- Có thể        --- Không thể (chỉ public static final)
Mục đích sử dụng          --- Mô tả đối tượng cụ thể --- Mô tả đối tượng chung --- Mô tả hành vi chung