/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import ExceptionInAnotherException.AgeUtils;

/**
 *
 * @author khai
 */
public class Test {
    public static void main(String[] args) throws TooYoungException, TooOldException {
        AgeUtils.checkAge(40);
        
    }
}
