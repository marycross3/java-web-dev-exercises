package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings =menu.getToppings();
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        //System.out.println(flavors);
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        //System.out.println("\n"+flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        //System.out.println(cones);
        Comparator comparator1 = new ConeComparator();
        cones.sort(comparator1);
        //System.out.println(cones);


        //doesn't work
        //System.out.println(toppings);
        Comparator comparator2 = new ToppingComparator();
        System.out.println(toppings);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
