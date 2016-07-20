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
public enum Gender {
    MALE("M", "Male"), FEMALE("F", "Female");
 
   private String code;
   private String text;
 
   // Cau tu nay chi dung trong noi bo Enum
   // Modifier cua cau tu luon là private
   // Neu ban khong khai bao private, java cung se hieu la private.
   private Gender(String code, String text) {
       this.code = code;
       this.text = text;
   }
 
   public static Gender getGenderByCode(String code) {
       for (Gender gender : Gender.values()) {
           if (gender.code.equals(code)) {
               return gender;
           }
       }
       return null;
   }
 
   public String getCode() {
       return code;
   }
 
   public void setCode(String code) {
       this.code = code;
   }
 
   public String getText() {
       return text;
   }
 
   public void setText(String text) {
       this.text = text;
   }
}
