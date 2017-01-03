import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by coltonsteinbeck on 1/2/17.
 */
public class Type {
    static Scanner reader= new Scanner(System.in);
    static ArrayList<String> array = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("What type of illness does this person have: Treatable, Reoccurring, or Terminal?");
        String s= reader.next();
        s = s.toLowerCase();
        int illness;
        switch(s){
            case "Terminal":
                illness = 1;
                break;
            case "Reoccurring":
                illness = 2;
                break;
            case "Treatable":
                illness = 3;
                break;
            default:

        }
}
}
