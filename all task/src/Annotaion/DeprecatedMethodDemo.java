/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotaion;

import java.util.Date;

/**
 *
 * @author khai
 */
public class DeprecatedMethodDemo {
    /**
    * @deprecated replaced by {@link #todo(String,Date)}
    */
   @Deprecated
   public void todoJob(String jobName) {
       System.out.println("Todo " + jobName);
   }
 
   public void todo(String jobName, Date atTime) {
       System.out.println("Todo " + jobName + " at " + atTime);
   }
 
   public void todoNothing() {
       System.out.println("Todo Nothing");
   }
 
   public static void main(String[] args) {
 
       DeprecatedMethodDemo obj = new DeprecatedMethodDemo();
 
       obj.todoJob("Java coding");
 
       obj.todoNothing();
   }
}
