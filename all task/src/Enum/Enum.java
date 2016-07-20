/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author khai
 */
public class Enum {
    public static void main(String[] args) {
        WeekDay today = WeekDay.SATERDAY;
        if(today == WeekDay.SATERDAY){
            System.out.println("Today is SATUDAY");
        }
        // Lấy ra tất cả các phần tử của Enum
        WeekDay[] allDays = WeekDay.values();
        for(WeekDay day: allDays){
            System.out.println("Day: " +day);
        }
        
      System.out.println("\nEnum có thể có cấu tử và method:");
      Gender marryGender = Gender.FEMALE;
 
      System.out.println("Code: " + marryGender.getCode());
      System.out.println("Text: " + marryGender.getText());
 
      // Gender[].
      for (Gender gender : Gender.values()) {
          System.out.println(gender.getText());
      }
      String code ="M";
      Gender gender= Gender.getGenderByCode(code);
      
      System.out.println("Gender by code: "+ gender);
        
        
        System.out.println("\nghi de trong java:");
         Currency money = Currency.USD;
 
        System.out.println("Money " + money);
        System.out.println("Money " + money.toString());
        System.out.println("VND " + Currency.VND);
        System.out.println("EURO " + Currency.EURO);
    }
}
