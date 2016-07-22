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
public class ValidateException extends Exception {
    
   // Gói Exception trong một Exception khác
   public ValidateException(Exception e)  {
       super(e);
   }
 
}
