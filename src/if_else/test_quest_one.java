package if_else;

import java.util.Scanner;

public class test_quest_one {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input value : ");
        Double num = in.nextDouble();


        if (num%2==0){
            System.out.println("The number is even");
        }
        else
            System.out.println("the number is odd");

    }
    //Write a program to check whether a number is even or odd
}

