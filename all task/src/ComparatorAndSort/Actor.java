/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorAndSort;

/**
 *
 * @author khai
 */
public class Actor implements Comparable<Actor> {
    private String firstName;
    private String lastName;
    public Actor(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
 
    public String getFirstName() {
      return firstName;
    }
 
    public String getLastName() {
      return lastName;
    }
    @Override
    public int compareTo(Actor other) {
      int value = this.lastName.compareTo(other.lastName);
      if (value != 0) {
          return value;
      }
      value = this.firstName.compareTo(other.firstName);
      return value;
    }
     
}
