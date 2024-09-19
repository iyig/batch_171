package day01variables;

import java.util.Arrays;
import java.util.Scanner;

public class var01Impl {

    public static void main(String[] args) {

        String s = "Calis bakalim zor mu?";
        String words[] = s.split("");
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("m")) {
                counter++;
            }
        }

        System.out.println(counter);

        //Bir string de kullanılan tum harflerin sayisini gösteren kodu yazunız
        // Alaaddin==>A=1, l=1,a=3; d= 2, i= 1,n=1

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String t = scan.nextLine();


        String ch[] = t.split("");

        System.out.println(Arrays.toString(ch));

       Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
       //counter olusturalım
        int counter1=0;

        for (int i =1 ; i < ch.length; i++) {
if(ch[i-1].equals(ch[i])){
    counter1++;
}else{
    System.out.println(ch[i-1]+ "'in sayisi: "+(counter1 +1));
  counter1=0;
}
       if(i==ch.length-1){
           System.out.println(ch[i]+"'ın sayisi: " + (counter1 +1));
        }
}
    }
}