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
public enum Currency {
     VND, USD, EURO ;
 
  @Override
  public String toString() {
      if (this == VND) {
          return "Dong";
      } else if (this == USD) {
          return "Dola";
      }
      return super.toString();
  }
}
