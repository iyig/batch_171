package d11arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        // Kullanıcının coklu data yi bir arraye yerlestreblirmesi. istedigi zaman durdurabilmesi icin greken kodu yazılması
        /*
        1) Kullanıcıdan data almak icın Scanner object olustur
        2)Coklu data yi yerlestırmek icin bir array olusturmalıyız
        3) Array olusturabilmek ıcın kullanıcıdan arraye kac tame eleman koyacagını almalıyız
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyız
         */

       Scanner input=new Scanner(System.in);
        System.out.println("Istediginiz örenci sayisini giriniz");
        int numOfElements=input.nextInt();

        String stdNames[]=new String[numOfElements];


        for (int i = 0; i <stdNames.length ; i++) {
            System.out.println((i+1) + "ögrencinin ismını giriniz . ");
            String name=input.next();
            if (name.equals("q")){
                break;
        }else{
                stdNames[i]=name;
         }


        }
        System.out.println("işlemi durdurmak icin 'q' basınız" );
        System.out.println(Arrays.toString(stdNames));
    }

}
