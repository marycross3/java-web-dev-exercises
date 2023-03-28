package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static String fiveLetters(ArrayList<String> str, int numLetters){
        int number = 5;
        for (String word: str){
            if (word.length() == numLetters){
                System.out.println(word);
            }
        } return " ";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> StringList = new ArrayList<>();
        Collections.addAll(StringList, "cat","horse", "dog",
                "mouse", "pig", "lizard", "monkey", "bear", "whale");
        System.out.println("Enter a word length: ");

        String phrase = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I " +
                "will not eat them with a mouse.";
        String [] strSplit = phrase.split(" ");
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(strSplit));

        int numLetters = input.nextInt();
        System.out.println(fiveLetters(strList, numLetters));
    }

}
