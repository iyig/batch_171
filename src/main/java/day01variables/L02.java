package day01variables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class L02 {
    public static void main(String[] args) {


        //Bir elemani degiştirme nasıl yapılır
        List<String> sl=new ArrayList<>();
        sl.add("Ali");
        sl.add("Kemal");
        sl.add("Ayse");
        //bir eleman degiştırme nasıl yapılır
        sl.set(0,"Aliye");
        System.out.println(sl);
        // Bir eleman varlığı nasıl kontrol edilir
        System.out.println(sl.contains("Kemal"));
        System.out.println(sl.contains("wwww"));

        // Elemanları natural ordera göre nasıl dızeriz( Kücükten buyuge +Alfabetik sıra)

        Collections.shuffle(sl);
        System.out.println(sl); //[Ayse, Aliye, Kemal]

        // Elemanlaır naturel order tersine göre sıralama nasıl yapılır
        Collections.reverse(sl);
        System.out.println(sl); //[Ayse, Aliye, Kemal]

        //Listeki elemanların  tamamnını nasıl sileriz
        sl.clear();
        System.out.println(sl);

        // iki list esit olup olmadıgını nasıl kontrol ederiz
        List<Integer>il1= new ArrayList<>();
        il1.add(12);
        il1.add(13);
        il1.add(14);
        List<Integer>il2=new ArrayList<>();
        il2.add(12);
        il2.add(13);
        il2.add(14);

        System.out.println(il1.equals(il2));//Eşitse true


    }

}
