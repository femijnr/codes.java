package if_else;

import java.util.Scanner;

public class check_alphabet {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input characters");
        char ch = input.next().charAt(0);


        if (ch>= 'a' && ch<= 'z' || ch>= 'A' && ch<= 'B'){
            System.out.println("This is an alphabet");
        }
        else
            System.out.println("this is not an alphabet");
    }
}
