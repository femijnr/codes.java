package iteration;

import java.util.Random;

public class primality {
    public static void main(String [] args) {

        int num = 17;

        boolean is_prime = true;
        for (int i = 2; i<num; i++){
            if (num%i == 0){
                 is_prime = false;
            }
        }
        if (is_prime){
            System.out.println(num + " " + "prime number");
        }
        else
        {
            System.out.println(num + " " + " not a prime number");
        }

    }
}
