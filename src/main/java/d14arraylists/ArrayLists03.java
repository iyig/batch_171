package d14arraylists;

import java.util.List;

public class ArrayLists03 {


    public static void main(String[] args) {
        //Kısa yoldan bir list nasıl olusturulurl

        // List.of() methodu degistirlemez bir List olusturmak icin kullanilir.Degişiklik  yapmaya methodlara desteklemez
        //  List<Integer> initials=List.of(1,2,3);
        List<Character>initials= List.of('a' , 'k', 'c', 'd', 'k');
        System.out.println(initials); //[a, k, c, d, k]

       // initials.add('b');
        //System.out.println(initials);


        // indexOf(aranan karakter) methodu aranan karakterin ilk görünümünun index ini verir.
      int r1= initials.indexOf('k');
        System.out.println(r1);//1

        // lastIndexOf(aranan karakter) methodu aranan karakterin son görünümün index ini verir

        int r2=initials.lastIndexOf('k');
        System.out.println(r2);//4

    }}
