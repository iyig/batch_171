package d11arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        // Arrayleri kısa yoldan nasıl olusturuabliriz
        int arr[]={63,19,313,353,7,100,4 };
        System.out.println(Arrays.toString(arr));//[63, 19, 313, 353, 7, 100, 4]

        // Verilen array de kac tane cıft sayi kac tane tek sayı odlugunu bulan kodu bulun

        int sayac=0;
        for (int w: arr){
            if (w%2==0){
                sayac++;

            }
        }

        System.out.println(sayac);
        System.out.println("Array de "  +sayac+  " adet cıft sayi " +(arr.length-sayac)+ " adet tek sayi kullanılmışstır");

        //
        String stdNames []=new String[5];
        stdNames[0]="Ajda";
        stdNames[1]="Cuneyt";
        stdNames[2]="Tom";
        stdNames[3]="Ayhan";
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames));

        for (String w:stdNames){
            if (w.length()<5){
                System.out.println(w);


                // Size verilen bir string array deki isimleri alfabetik sıraya koyduktan sonra
                //"F" ile başlayan isimler haric diger isimleri xonsosa yazdırını

                // Note 1: sort() methodu sayısal data type ları kucukten buyuye sıralar(ascending order )
                // Note 2: sort() methodu Stirng data typlerri alfabetik olarak sıralar(alfabetical order)

                // Note3: ascending order + alphabetical order == Natural Order

                Arrays.sort(stdNames);
                System.out.println(Arrays.toString(stdNames));

                for (String v: stdNames){
                    if (v.startsWith("F")){

                        continue;
                    }

                    System.out.println(v);
                }


            }
        }
    }
}
