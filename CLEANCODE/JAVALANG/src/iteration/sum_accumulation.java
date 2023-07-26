package iteration;

import java.util.Random;

public class sum_accumulation {
    public static void main(String [] args){
        Random in = new Random();
        float sum = 0;
        for (int i =0; 1<5; i++) {
            float x = in.nextFloat();
            sum += x;
            System.out.println("\t" + x + "\t" + sum);

        }

    }
}
