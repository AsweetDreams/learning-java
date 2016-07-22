/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionInAnotherException;

/**
 *
 * @author khai
 */
public class WrapperExceptionDemo {
 
   public static void main(String[] args) {
        
       // Một người tham gia tuyển dụng.
       Person person = new Person("Marry", Person.MALE, 20);
 
       try {
 
           // Ngoại lệ có thể xẩy ra tại đây.
           ValidateUtils.checkPerson(person);
           
           System.out.println("did past");
 
       } catch (ValidateException wrap) {
 
           // Lấy ra nguyên nhân thực sự.
           // Mà có thể là TooYoungException, TooOldException, GenderException
           Exception cause = (Exception) wrap.getCause();
 
           if (cause != null) {
               System.out.println("Not pass, cause: " + cause.getMessage());
           } else {
               System.out.println(wrap.getMessage());
           }
 
       }
   }
 
}
