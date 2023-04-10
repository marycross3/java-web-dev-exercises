package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
import java.util.function.Function;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor flavor1, Flavor flavor2){
        //reverse order biggest to smallest- to reverse switch > and <
        if (flavor1.getAllergens().size() - flavor2.getAllergens().size() >0){
            return -1;
        } else if (flavor1.getAllergens().size() - flavor2.getAllergens().size()  <0) {
            return 1;
        } else {
            return 0;

        }
    }


//    @Override
//    public int compare(Flavor flavor1, Flavor flavor2) {
//        return flavor1.getName().compareTo(flavor2.getName());
//    }
}
