package org.launchcode.java.demos.lsn7interfaces;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

public class ToppingComparator implements Comparator<Topping> {

    //doesn't work
    @Override
    public int compare(Topping topping1, Topping topping2) {
        if (topping1.getAllergens().size() - topping2.getAllergens().size() < 0) {
            return -1;
        } else if (topping1.getAllergens().size() - topping2.getAllergens().size() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
