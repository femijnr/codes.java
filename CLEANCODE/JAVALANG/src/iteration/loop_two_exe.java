package iteration;

import java.util.Scanner;

public class loop_two_exe {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<10;i++){
            System.out.println("Enter a number");
            sum = sum+s.nextInt();
        }
        System.out.println("Sum is "+sum);
    }
    }
//Take 10 integers from keyboard using loop and print their average value on the screen.


