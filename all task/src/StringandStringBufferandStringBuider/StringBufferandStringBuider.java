/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringandStringBufferandStringBuider;

/**
 *
 * @author khai
 */

/*
    StringBuilder và StringBuffer là rất giống nhau, điều khác biệt là tất cả các phương thức của
    StringBuffer đã được đồng bộ, nó thích hợp khi bạn làm việc với ứng dụng đa luồng, nhiều luồng
    có thể truy cập vào một đối tượng StringBuffer cùng lúc. Trong khi đó StringBuilder có các
    phương thức tương tự nhưng không được đồng bộ, nhưng vì vậy mà hiệu suất của nó cao hơn,
    bạn nên sử dụng StringBuilder trong ứng dụng đơn luồng, hoặc sử dụng như một biến địa phương trong
    một phương thức.
*/


public class StringBufferandStringBuider {
     public static void main(String[] args) {
 
      // Tạo đối tượng StringBuilder
      // Hiện tại chưa có dữ liệu trên StringBuilder.
      StringBuilder sb = new StringBuilder(10);
      
      // Nối thêm chuỗi Hello vào sb.
      sb.append("Hello...");
      System.out.println("- sb after appends a string: " + sb);
 
      // append a character
      char c = '!';
      sb.append(c);
      System.out.println("- sb after appending a char: " + sb);
 
      // Trèn một String vào vị trí thứ 5
      sb.insert(8, " Java");
      System.out.println("- sb after insert string: " + sb);
      
      // Xóa đoạn String con trên StringBuilder.
      // Tại vị trí có chỉ số 5 tới 8
      sb.delete(5,8);
 
      System.out.println("- sb after delete: " + sb);
  }
}
