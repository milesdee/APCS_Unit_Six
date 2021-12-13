import java.io.FileWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SpellChecker {
    public static String[] getDictionary() throws IOException {
        String[] words = new String[61336];
        Scanner scan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while(scan.hasNext()){
            words[count] = scan.nextLine();
            count++;
        }
        return words;
    }
    public static boolean wordInDictionary(String word, String[] dictionary){
        for (String s : dictionary) {
            if (word.toLowerCase().equals(s)) return true;
        }
        return false;
    }
    public static String spellFix(String word, String[] wordbank){
        boolean right = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("You spelled '" + word + "' incorrectly. Would you like to try again? Say 'Y' for yes.");
        if (scan.nextLine().toLowerCase().equals("y")){
            System.out.println("Type the new spelling: ");
            word = scan.next();
        }
        else System.out.println("Okay.");
        return word;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/alice.txt"));
        FileWriter write = new FileWriter("files/corrected.txt");
        String[] wordbank = getDictionary();
        while(scan.hasNext()){
            String word = scan.next();
            if(wordInDictionary(word, wordbank)) write.write(word);
            else write.write(spellFix(word, wordbank));
        }
        write.close();
    }
}
