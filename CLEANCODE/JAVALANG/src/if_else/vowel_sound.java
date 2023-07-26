package if_else;

import java.util.Scanner;

public class vowel_sound {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input alphabet: ");
        char ch = in.nextLine().charAt(0);




        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("This is a vowel ");
        }
        else
        {
            System.out.println("Thisis a consonant ");
        }


    }
}
