import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class readWrite {

    public static String[] read() throws IOException {
        String[] words = new String[9];
        Scanner scan = new Scanner(new File("files/readfrom.txt"));
        int count = 0;
        while(scan.hasNext()){
            words[count] = scan.next();
            count++;
        }
        return words;
    }

    public static void write(String[] arr){

    }

    public static void main(String[] args) throws IOException {
        String[] arr = read();
    }
}
