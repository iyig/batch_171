package d14arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {
        // Bir listi baska bir list ile aynı olup olmadıgını nasıl kontrol ederiz
        ArrayList<String>names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String>names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Jim");
        names2.add("Kim");

       boolean s= names1.equals(names2);
        System.out.println(s);

        // Verilen iki integer listte tamamiiyla ayni elemanların olup olmadıgını  kontrol eden kodu yazınız
        ArrayList<Integer>nums1= new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2= new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean result= nums1.equals(nums2);
        System.out.println(result);

        // ArrayList te bir elemanın ilk görünümü nasıl silinir?
        ArrayList<String>cities= new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("İstanbul");
        cities.add("Yozgat");
        System.out.println(cities);
//remove() methodu bir elemanın ilk görünümü siler
        System.out.println(cities.remove("Miami"));cities.add("Miami");
        System.out.println(cities);
// ArrayListe bir eleman index i kullanarak nasıl silinir
        cities.remove(2);
        System.out.println(cities);
        //remove() methodu index ile kullanılırsa size silmiş oldugu datayi return eder
        //remove() me.eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden boolean retun eder

        //Ornek: Bir integer List olsuturun ve 12 elemanını  lİst den siliniz
        ArrayList<Integer>ages= new ArrayList<>();

        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
       // ages.remove(12);
        //System.out.println(ages);
        // 1.yol

       // Integer nonPrimitive=12;
        //ages.remove(nonPrimitive);
        //System.out.println(ages);

        // 2.yol
  //ages.remove((Integer) 12);
       // ages.remove(Integer.valueOf(12));
       //System.out.println(ages);

        //4.yol
        //ages.remove(ages.indexOf(12));
      //  System.out.println(ages);
// Bir ArrayList teki bir elemanın tum görünümlerini nasl sileriz

       List<String> citiesToRemove= new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("İstanbul");
        cities.removeAll(citiesToRemove);
        System.out.println(cities);
    }
}
