package d9string_loops;

public class StringManipulation02 {

    public static void main(String[] args) {

        //Ornek 1: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf

        //Example 1: Print the non-repeated characters in a String side by side on the screen.

        //indexOf("u")      ==> 1  farkli tekrarli
        //lastIndexOf("u")  ==> 3

        //indexOf("y")      ==> 0 ayni tekrarsiz
        //lastIndexOf("y")  ==> 0

        String s = "yusuf";


        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }

        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }

        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }

        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }


    }
}
