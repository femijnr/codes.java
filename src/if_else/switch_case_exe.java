package if_else;

import java.util.Random;

public class switch_case_exe {
    public static void main(String [] args){

            Random in = new Random();
            float x = in.nextFloat();


            int score = Math.round(50 * x + 50);
            System.out.println("x = " + score);

            switch (score/10){
                case 10:
                    break;

                case 9:
                    System.out.println("Excellent");
                    break;
                case 8:
                    System.out.println("Very good !");
                    break;
                case 7:
                    System.out.println("good !");
                    break;
                case 6:
                    System.out.println("Average!");
                    break;
                case 5:
                    System.out.println("fair. try better!");
                    break;
                default:
                    System.out.println("not valid");


            }

        }
}
