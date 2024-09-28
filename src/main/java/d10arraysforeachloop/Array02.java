package d10arraysforeachloop;

import java.util.Arrays;

public class Array02 {

    public static void main(String[] args) {
        // String array olusturun icine 5 tane eleman ekleyin ilk eleman ile son eleman icerdigi karakter sayıları toplamıını ekr
   
   String arr []= new String[5];
   arr[0]= "Ahmet";
   arr[arr.length-1]="Ugur";

            System.out.println( arr[0].length() + arr[arr.length - 1].length());


    // String bir array olusturun icine 5 tane eleman ekleyin
        //tum elemanların ıcerdıgı karakter sayıları toplamını ekrana yazdırın

        String brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        int totalChar=0;

        System.out.println(Arrays.toString(brr));

        for (int i = 0; i <brr.length ; i++) {
            totalChar= totalChar + brr[i].length();

        }
        System.out.println(totalChar);

        // baslangıc degeri,looun calısma sartı ve increment kismını kendsı halleder
        // for -each loop Arraylerde  ve "collection"larda kullanılır
int sum=0;
        for (String w:brr) {
          sum= sum+ w.length();
        }

        System.out.println(sum);
        
// Notlar adında Integer bir array olusturunuz icine 6 tane not yerlestırınız ve not ortalaması ekrana y.
        int notlar[]=new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;
        System.out.println(Arrays.toString(notlar));
 int toplam=0;
        for (int w:notlar){

          toplam= toplam+w;
        }
        System.out.println(toplam/notlar.length);
    }
    }

