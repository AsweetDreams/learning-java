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
public class ActorSortingComparator {
    public static void main(String[] args) {
         Actor actor1 = new Actor("Mischa", "Barton");
      Actor actor2 = new Actor("Christian", "Bale");
      Actor actor3 = new Actor("Joan", "Collins");
      Actor actor4 = new Actor("Gemma", "Arterton");
      Actor actor5 = new Actor("Daniel", "Craig");
 
      Actor[] actors = new Actor[] { actor1, actor2, actor3, actor4, actor5 };
      for (int i = 0; i < actors.length; i++) {
 
          for (int j = i + 1; j < actors.length; j++) {
              if (actors[j].compareTo(actors[i]) < 0) {
                  // Sử dụng một biến tạm thời.
                  Actor temp = actors[j];
                  actors[j] = actors[i];
                  actors[i] = temp;
              }
          }
      }
      // Bây giờ thì in ra các phần tử mảng.
      for (int i = 0; i < actors.length; i++) {
          System.out.println(actors[i].getFirstName() + "  "
                  + actors[i].getLastName());
      }
    }
}
