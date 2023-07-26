package Strings;

public class substrings {
    public static void main(String [] args){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("the substring from index 4 to 8 is " + alphabet.substring(4, 8));
        System.out.println("the substring from index 4 to 4 is "  + alphabet.substring(4, 4));
        System.out.println("The substring from index 4 to 5 is " + alphabet.substring(4, 5));
        System.out.println("The substring from index 0 to 8 is " + alphabet.substring(0, 8));
        System.out.println("the substring from index 8 to the end is " + alphabet.substring(8));

    }
}
