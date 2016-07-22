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
public class ValidateUtils {
 
   // Method kiểm tra đầu vào của người tuyển dụng.
   public static void checkPerson(Person person) throws ValidateException {
       try {
           // Kiểm tra tuổi.
           // Hợp lệ là trong khoảng 18-40
           // Method này có thể ném ra TooOldException,TooYoungException.
           AgeUtils.checkAge(person.getAge());
 
       } catch (Exception e) {
 
           // Nếu không hợp lệ
           // Gói ngoại lệ này bằng ValidateException
           throw new ValidateException(e);
 
       }
 
       // Nếu người đó là Nữ, nghĩa là không hợp lệ.
       if (person.getGender().equals(Person.FEMALE)) {
 
           GenderException e = new GenderException("Do not accept women");
           throw new ValidateException(e);
 
       }
   }
 
}
