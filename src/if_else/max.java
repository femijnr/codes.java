package if_else;

public class max {
    public static void main (String [] args){
        int a = 5;
        int b = 7;
        int c = 4;


        if (a>b && a>c){
            System.out.println("a is the greatest " + a);

        }
        else if (b>a && b>c){
            System.out.println("b is the greatest " + b);


        }

        else System.out.println("c is the greatest value " + c);
    }

}
