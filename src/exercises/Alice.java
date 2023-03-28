package exercises;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Alice {

    public static void main(String[] args){

        String sentence = ("Alice was beginning to get " +
                "very tired of sitting by her sister on " +
                "the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book " +
                "her sister was reading, but it had no " +
                "pictures or conversations in it, " +
                "'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String searchTerm = input.nextLine().toLowerCase();
        sentence = sentence.toLowerCase();
        if (sentence.contains(searchTerm)){
            System.out.println("Index: "+sentence.indexOf(searchTerm));
            System.out.println("Length: "+searchTerm.length());
            sentence = sentence.replace(searchTerm, "");
            System.out.println(sentence);
        }
    }
}
