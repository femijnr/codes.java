package if_else;

import java.util.Scanner;

public class test_quest {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Input value: ");
        Double num = in.nextDouble();

        if(num%5==0 && num%11==0){
            System.out.println("divisible by 5 and 11");
        }

        else
            System.out.println("not divisible by 5 and 11");






    }
}
