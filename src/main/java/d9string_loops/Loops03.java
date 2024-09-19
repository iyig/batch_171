package d9string_loops;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {
        /*
        Kullanıcan başlangıc ve bitıs degerlerini alın
        başlangıö degerinden baslayip bitis degerie kadar aradaki tum cuftsayıları ekrana yazdırınız


         */
        Scanner input=new Scanner(System.in);
        System.out.println("Başlangic degerini giriniz");
        int start= input.nextInt();
        System.out.println("bitis degerini giriniz");
        int end=input.nextInt();
        for (int i = start; i <=end ; i++) {
            if (i%2==0){
                System.out.println(i+ " ");

            }
        }

    }
}
