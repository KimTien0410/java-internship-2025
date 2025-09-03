18. Tìm hiểu, giải thích Design Pattern là gì và giải thích mục đích/ý nghĩa của vài pattern (tuỳ chọn)
=> Design Pattern là các giải pháp tổng thể đã được tối ưu hoá, được tái sử dugnj cho các vấn đề phổ biến trong thiết kế phần mềm mà chúng ta thường gặp phải hàng ngày.
- Design patterns là một kỹ thuật trong lập trình hướng đối tượng, không phải là một ngôn ngữ cụ thể nào cả, nó là một kỹ thuật lập trình. Nó cung cấp cho chúng ta các "mẫu thiết kế" để giải quyết các vấn đề phổ biến trong phát triển phần mềm.
- Design pattern giúp giải quyết vấn đề một cách tối ưu nhất, cung cấp cho bạn các giải pháp trong lập tình OOP.
- Design pattern giúp bạn tái sử dụng code, giảm thiểu sự trùng lặp trong code, giúp code của bạn dễ bảo trì và mở rộng hơn.
- Design pattern giúp bạn giao tiếp tốt hơn với các lập trình viên khác, vì nó cung cấp cho bạn một ngôn ngữ chung để thảo luận về các giải pháp thiết kế.
- Design pattern giúp bạn viết code dễ đọc và dễ hiểu hơn, vì nó cung cấp cho bạn các cấu trúc và quy ước rõ ràng để tổ chức code của bạn.
- Design pattern giúp bạn tiết kiệm thời gian và công sức trong việc thiết kế phần mềm, vì bạn không cần phải tự mình phát minh ra các giải pháp từ đầu.
- Design pattern giúp bạn nâng cao kỹ năng lập trình của mình, vì nó yêu cầu bạn phải hiểu rõ các nguyên tắc và khái niệm cơ bản của lập trình hướng đối tượng.
- Design pattern giúp bạn tạo ra các ứng dụng linh hoạt và dễ mở rộng hơn, vì nó khuyến khích bạn sử dụng các nguyên tắc thiết kế như SOLID và DRY.
- Design pattern giúp bạn tạo ra các ứng dụng dễ kiểm thử hơn, vì nó khuyến khích bạn sử dụng các nguyên tắc thiết kế như Dependency Injection và Inversion of Control.

** Design pattern có thể được chia thành 3 loại chính: Creational, Structural và Behavioral. Mỗi loại có các pattern cụ thể như sau:
1. Creational Patterns: Tập trung vào việc tạo đối tượng một cách hiệu quả và linh hoạt.
   - Singleton: Đảm bảo một lớp chỉ có một thể hiện duy nhất và cung cấp một điểm truy cập toàn cục đến nó.
   - Factory Method: Cung cấp một giao diện để tạo đối tượng trong siêu lớp, nhưng cho phép các lớp con quyết định lớp nào sẽ được khởi tạo.
   - Abstract Factory: Cung cấp một giao diện để tạo các họ đối tượng liên quan hoặc phụ thuộc mà không cần chỉ định lớp cụ thể của chúng.
   - Builder: Tách quá trình xây dựng một đối tượng phức tạp khỏi biểu diễn của nó, cho phép cùng một quá trình xây dựng có thể tạo ra các biểu diễn khác nhau.
   - Prototype: Cho phép sao chép các đối tượng hiện có mà không cần biết chi tiết về cách chúng được tạo ra.
2. Structural Patterns: Tập trung vào việc tổ chức các lớp và đối tượng để tạo ra các cấu trúc lớn hơn.
   - Adapter: Cho phép các giao diện không tương thích làm việc cùng nhau bằng cách chuyển đổi giao diện của một lớp thành giao diện mà khách hàng mong đợi.
   - Composite: Tổ chức các đối tượng thành cấu trúc cây để biểu diễn quan hệ phần-tổng thể, cho phép khách hàng xử lý các đối tượng riêng lẻ và các nhóm đối tượng một cách đồng nhất.
   - Proxy: Cung cấp một đại diện hoặc thay thế cho một đối tượng khác để kiểm soát truy cập đến nó.
   - Decorator: Thêm chức năng bổ sung vào một đối tượng một cách động mà không làm thay đổi cấu trúc của nó.
   - Facade: Cung cấp một giao diện đơn giản hơn cho một hệ thống phức tạp, giúp giảm sự phụ thuộc giữa các phần của hệ thống.
3. Behavioral Patterns: Tập trung vào việc quản lý các tương tác và trách nhiệm giữa các đối tượng.
   - Observer: Định nghĩa một phụ thuộc một-nhiều giữa các đối tượng sao cho khi một đối tượng thay đổi trạng thái, tất cả các đối tượng phụ thuộc của nó sẽ được thông báo và cập nhật tự động.
   - Strategy: Định nghĩa một họ các thuật toán, đóng gói từng thuật toán và làm cho chúng có thể hoán đổi cho nhau. Strategy cho phép thuật toán thay đổi độc lập với khách hàng sử dụng nó.
   - Command: Đóng gói một yêu cầu dưới dạng một đối tượng, cho phép bạn tham số hóa các khách hàng với các yêu cầu khác nhau, xếp hàng hoặc ghi lại các yêu cầu, và hỗ trợ các hoạt động có thể hoàn tác.
   - Chain of Responsibility: Truyền một yêu cầu dọc theo một chuỗi các đối tượng xử lý cho đến khi một đối tượng xử lý nó. Mỗi đối tượng trong chuỗi có thể chọn xử lý yêu cầu hoặc chuyển nó cho đối tượng tiếp theo trong chuỗi.
   - State: Cho phép một đối tượng thay đổi hành vi của nó khi trạng thái nội bộ của nó thay đổi. Đối tượng sẽ xuất hiện như thể nó đã thay đổi lớp của nó.
