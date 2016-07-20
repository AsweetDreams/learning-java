/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorAndSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author khai
 */
public class ListSortingDemo {
    public static void main(String[] args) {
       Actor actor1 = new Actor("Mischa", "Barton");
       Actor actor2 = new Actor("Christian", "Bale");
       Actor actor3 = new Actor("Joan", "Collins");
       Actor actor4 = new Actor("Gemma", "Arterton");
       Actor actor5 = new Actor("Daniel", "Craig");
 
       // Một danh sách chứa các phần tử có thể so sánh với nhau.
       List<Actor> actors = new ArrayList<Actor>();
 
       actors.add(actor1);
       actors.add(actor2);
       actors.add(actor3);
       actors.add(actor4);
       actors.add(actor5);
 
       // Su dung Collections.sort(List)
       // de sap xep 1 danh sach (List)
       Collections.sort(actors);
 
       for (Actor actor : actors) {
           System.out.println(actor.getFirstName() + "  "
                   + actor.getLastName());
       }
    }
}
