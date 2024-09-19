package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {


/*
1.Elemanlarını kullanıcın girdigi bir String list olusturunuz Strinlerin tamaı rakamlardadn oluşsun
2.Bu listin elemanlarının carpımını ekrana yazdırınız.
 */

        Scanner input = new Scanner(System.in);
        String str="";
        List<String> list=new ArrayList<>();


        do {
            System.out.println("Rakamlardan ousan Stringler giriniz");
            System.out.println("String girmeyi durdurmak icin 1's' giriniz");
            str= input.next().toUpperCase();
            if (!str.equals("S")) {
                list.add(str);
            }
        }while(!str.equals("S"));
        System.out.println(list);
      int carpim=1;
        for (int i=0; i<list.size(); i++){

carpim=carpim*Integer.parseInt(list.get(i));
        }
        System.out.println(carpim);



    }
}