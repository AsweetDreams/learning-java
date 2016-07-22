
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
public class ReplaceDemo {
    public static void main(String[] args) {
      String str = "This is text";
      
      //thay the ky tu i trong chuoi bang x
      String s2 = str.replace('i', 'x');
 
      System.out.println("- s2=" + s2);
      
       //thay the tat cac cac chuoi con khop voi "is" boi abc
      String s3 = str.replaceAll("is", "abc");
 
      System.out.println("- s3=" + s3);
      
      //thay the tat cac cac chuoi con dau tien khop voi "is" boi abc
      String s4 = str.replaceFirst("is", "abc");
      
      System.out.println("- s4=" + s4);
 
      // Thay the tat ca chuoi con khop voi bieu thuc
      // "is|te": nghia la "is" hoac "te"
      // thay boi "+".
      String s5 = str.replaceAll("is|te", "+");
      System.out.println("- s5=" + s5);
  }
}
