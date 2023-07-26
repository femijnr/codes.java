package Strings;

public class alphabet {
    public static void main(String [] args){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet);
        System.out.println("This string contains " +  alphabet.length() + " characters.");
        System.out.println("the character at index 4 is " + alphabet.charAt(4));
        System.out.println("the index of the character z is " + alphabet.indexOf("z"));
        System.out.println("The hashcode of th estring is " + alphabet.hashCode());
    }
}
