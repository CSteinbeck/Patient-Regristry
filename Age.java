/**
 * Created by coltonsteinbeck on 1/2/17.
 */
import java.util.*;
public class Age {
    static Scanner reader = new Scanner(System.in);
    static ArrayList array = new ArrayList<Integer>();

    public static void main(String[] args){
        System.out.println("Please enter your age");
        int in= reader.nextInt();
        while(in !=0){
            array.add(in);
            in= reader.nextInt();
        }
        System.out.println("---------------------------------------");
        for(Object i: array){
            System.out.println(i);
        }
    }
}
