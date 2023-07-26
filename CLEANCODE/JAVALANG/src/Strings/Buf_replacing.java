package Strings;

public class Buf_replacing {
    public static void main(String [] args){
        StringBuffer buf = new StringBuffer();
        buf.append("it was the best of times");
        System.out.println("buf = " + buf);
        System.out.println("buf.length () = " + buf.length());
        System.out.println("buf.capacity () = " + buf.capacity());
        buf.setCharAt(11, 'w');
        buf.setCharAt(12, 'o');
        buf.insert(13, 'r');
        System.out.println(buf);
        System.out.println("buf = " + buf);
    }
}
