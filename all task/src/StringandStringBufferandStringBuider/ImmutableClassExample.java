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
public class ImmutableClassExample  {
    private int value;
    private String name;
 
    public ImmutableClassExample(String name, int value)  {
           this.value = value;
           this.name= name;
    }
  
    public String getName()  {
           return name;
    }
 
    public int getValue()  {
          return value;
    }
}