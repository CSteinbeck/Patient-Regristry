/**
 * Created by coltonsteinbeck on 1/2/17.
 */
import java.util.*;
public class Name {
    static Scanner reader= new Scanner(System.in);
    static ArrayList<String> array = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("What is your name?");
        String s= reader.next();
        System.out.println("What is your last name?");
        String o= reader.next();
        System.out.println(s + o);

    }


}
