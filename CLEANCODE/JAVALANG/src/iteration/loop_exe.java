package iteration;

public class loop_exe {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 4) {
            System.out.println("hello" + " " + i);
            i++;
            int j =1;
            while (j<=3){
                System.out.println("hello world!");
                j++;
            }
        }
        System.out.println("bye  " + i);
    }
}
