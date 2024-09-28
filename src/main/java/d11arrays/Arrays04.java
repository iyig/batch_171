package d11arrays;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {
        // size verilen bir cumlede kac kelime oldugunu gösteren kodu yazınız
        String s= "Java is easy. Learn Java earn money.";
      String kelime []=  s.split(" ");
        System.out.println(Arrays.toString(kelime));
        System.out.println(kelime.length);


        // Size velilen bir cümlede kac harf oldugunu gösteren kodu ya

       String letters []= s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
