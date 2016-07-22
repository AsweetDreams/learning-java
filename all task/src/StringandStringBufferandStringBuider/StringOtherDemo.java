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
public class StringOtherDemo {
     public static void main(String[] args) {
       String str = "This is text";
 
       System.out.println("- str=" + str);
 
       // Tra ve chuoi chu thuong
       String s2 = str.toLowerCase();
 
       System.out.println("- s2=" + s2);
 
       // Tra ve chuoi chu hoa
       String s3 = str.toUpperCase();
 
       System.out.println("- s3=" + s3);
 
       // Kiem tra chuoi bat dau boi "this" hay khong
       boolean swith = str.startsWith("This");
 
       System.out.println("- 'str' startsWith This ? " + swith);
 
       // Mot chuoi voi cac khoang trang phia truoc va phaa sau:
       // Chu y: \t là ky tu TAB
       // \n la ky tu xuong dong.
       str = " \t Java is hot!  \t \n ";
 
       System.out.println("- str=" + str);
 
       // Su dung trim() đe loai bo cac khoang trang phia truoc va phia sau.
       String s4 = str.trim();
 
       System.out.println("- s4=" + s4);
   }
}
