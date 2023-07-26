package iteration;

import java.util.Random;

public class trials {
    public static void main(String [] args){
        Random in = new Random();
        float x = in.nextFloat();
        System.out.println("X = " + x);

        int num = (int)Math.floor(99*x+2);
        boolean is_prime = true;
        for (int i =2; i<num; i++){
            if (num%1==0){
                is_prime = false;
            }
        }
        if (is_prime){
            System.out.println(num + " " + "prime number");
        }
        else
        {
            System.out.println(num + " " + "it is not a prime number");
        }
    }
}
