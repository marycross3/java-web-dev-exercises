package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> IntegerList = new ArrayList<>();
        Collections.addAll(IntegerList, 1, 3, 4, 5, 6, 7, 7, 8, 9, 11, 12);
        System.out.println(sumEven(IntegerList));
    }


}



