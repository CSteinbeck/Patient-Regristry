/**
 * Created by coltonsteinbeck on 1/2/17.
 */

// Male = 1
//female =2

import java.util.*;
public class Gender {
    static Scanner reader= new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("What is your gender?");
        String s= reader.nextLine();
        s = s.toLowerCase();
        int gender;
        switch(s){
            case "female":
                gender = 2;
                System.out.println("F");
                break;
            case "male":
                    gender = 1;
                System.out.println("M");
                    break;
                    default:
                        System.out.println("You're a genderless bitch");

        }

    }
}
