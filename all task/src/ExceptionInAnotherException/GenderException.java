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
// Ngoại lệ giới tính.
public class GenderException extends Exception {
 
     public GenderException(String message)  {
         super(message);
     }
}
