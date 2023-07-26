package if_else;

import java.util.Scanner;

public class quadratic_eqn {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        Double a = in.nextDouble();
        System.out.println("Enter th evalue of B: ");
        Double b = in.nextDouble();
        System.out.println("Enter the value of C: ");
        Double c = in.nextDouble();


        double root1;
        double root2;


        double discriminant = b*b-4*a*c;

        if (discriminant <0){
            System.out.println("the number is unimaginary");

        }

        if (discriminant == 0){
            System.out.println("Roots are equal");
            // generally to solve for equal roots you use -b/2*a
            root1 = -b / (2*a);
            root2 = -b / (2*a);
        }

        if (discriminant > 0){
            System.out.println("roots are not equal");
            root1 = -b + Math.sqrt(discriminant) / 2*a;
            root2 = -b - Math.sqrt(discriminant) / 2*a;

            System.out.println("root sof the quadratic equation are ;");
            System.out.println("Root1 = " +  root1);
            System.out.println("Root2 = " + root2);
        }
    }

}
