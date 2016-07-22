/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionInAnotherException;

import Exception.TooOldException;
import Exception.TooYoungException;

/**
 *
 * @author khai
 */
public class AgeUtils {
  // Method này làm nhiệm vụ kiểm tra tuổi.
  // Nếu tuổi nhỏ hơn 18 method sẽ ném ra ngoại lệ TooYoungException
  // Nếu tuổi lớn hơn 40 method sẽ ném ra ngoại lệ TooOldException
  public static void checkAge(int age) throws TooYoungException,
          TooOldException {
      if (age < 18) {
          // Nếu tuổi nhỏ hơn 18, ngoại lệ sẽ được ném ra
          // Method này kết thúc tại đây.
          throw new TooYoungException("Age " + age + " too young");
      } else if (age > 40) {
          // Nếu tuổi lớn hơn 40, ngoại lệ sẽ được ném ra.
          // Method này kết thúc tại đây.
          throw new TooOldException("Age " + age + " too old");
      }
      // Nếu tuổi nằm trong khoảng 18-40.
      // Đoạn code này sẽ được chạy.
      System.out.println("Age " + age + " OK!");
  }
}
