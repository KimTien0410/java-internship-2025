19. Giải thích khối lệnh try-catch và try-catch-resource
> **try-catch** dùng để xử lý ngoại lệ(exception handling)
>> Ý nghĩa:
 >>+ try: chứa đoạn code có khả năng gây ra lỗi.
>> + catch: Bắt và xử lý lỗi nếu có.
>> + finally: khối lệnh này sẽ luôn được thực thi dù có lỗi hay không.

> **try - catch - resource**: dùng để quản lý tài nguyên (resource management) như: File, Socket, Database connection ... bất kỳ class nào cài đặt AutoCloseable hoặc Closeable.

``` java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResourceExample
public static void main(String[] args)
 try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
  String line;
  while ((line = br.readLine()) != null) 
   System.out.println(line);
  }
   } catch (IOException e) {
   System.out.println("Lỗi: " + e.getMessage());
  }
 }
}
```
> Ở đây BufferedReader và FileReader đều implement AutoCloseable, nên java sẽ tự động đóng file sau khi chạy xong khối try.