package if_else;

public class switch_case {
    public static void main(String [] args){
        switch (3){

            case 1:
                System.out.println("sunday ");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default: System.out.println("Enter a valid number");

                // we need break to come out of all the cases, unless it types from the desired value, to the end.

        }
    }
}
