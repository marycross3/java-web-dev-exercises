package org.launchcode.java.demos.Studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountingCharacters {
    public static void main(String[] args){
        String data = null;
        try {
            File myFile = new File("src/org/launchcode/java/demos/Studios/importingFileJavaPractice.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                data = myReader.nextLine();
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Scanner input = new Scanner(System.in);
        //String testString = "This is a test";
        //System.out.println("Enter a phrase: ");
        //String testString = input.nextLine();
        char[] charactersInString = data.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();

        for (char i: charactersInString){
            if (!characters.containsKey((i)) && Character.isLetter(i)) {
                characters.put(i, 1);
            }
            else if (characters.containsKey(i)) {
                characters.put(i, characters.get(i) + 1) ;
            }
        }
        for(Map.Entry<Character, Integer> i: characters.entrySet()){
            System.out.println(i.getKey() + ":"+ i.getValue());
        }

    }
}
