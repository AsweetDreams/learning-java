/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorAndSort;

import java.util.Arrays;

/**
 *
 * @author khai
 */
public class ActorSortingWithArray {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Mischa", "Barton");
       Actor actor2 = new Actor("Christian", "Bale");
       Actor actor3 = new Actor("Joan", "Collins");
       Actor actor4 = new Actor("Gemma", "Arterton");
       Actor actor5 = new Actor("Daniel", "Craig");
 
       Actor[] actors = new Actor[] { actor1, actor2, actor3, actor4, actor5 };
 
    
       // Su dung Arrays.sort(Object[]) de sap xep.
       Arrays.sort(actors);
        
       for (int i = 0; i < actors.length; i++) {
           System.out.println(actors[i].getFirstName() + "  "
                   + actors[i].getLastName());
       }
    }
}
