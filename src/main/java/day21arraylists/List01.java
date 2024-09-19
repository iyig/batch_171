package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class List01 {

    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("B");
        ls.add("A");
        ls.add("M");
      ls.add(1,"K");
      ls.add(0,"S");
      ls.add("T");
      ls.add("M");
      // Listin icindeki eleman sayısını bulmak
        System.out.println(ls.size());

        System.out.println(ls);

        //Bir listi boş olup olmadıgını kontrol etmek
        System.out.println(ls.isEmpty());
// Bir listten index kullanarak eleman silmek
        ls.remove(2);
        System.out.println(ls);

        // bir listen eleman ismi ile eleman silmek
        //
        // ls.remove("T");
        System.out.println(ls.remove("T"));
        System.out.println(ls);
        ls.remove("M");
        System.out.println(ls);
        // Bir listde istenen elemanın var olup olmadığını kontrol etmek
    }
}
