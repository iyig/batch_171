package d11arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // Specifi bir elemanın array de olup olmadıgını anlamak icin greken kodu yazınınz

        String name[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        // 1 yol
    int counter=0;
        for (String w:name) {
 if (w.equals(el)){
     counter++;
     break;
 }
        }
if(counter>0){
    System.out.println("Array has" + el);
}else{
    System.out.println("Array does not have" + el);
}
   // 2. way: binarySearch() methodu

        /*
        binarySearch() methodunu sort() kullanmadan kullanmayınız cunku binarySearch(9 mantıgı sıralı elemnanlar
        2)binarySearch() methodu var olan elemanlar icin size o elemanın index ini verir
        3) binary Search() methodu olmayan elemanlar ıcın negatif tamsayı degeri verir
        "-" isartinin anlmı o eleman yok demektır
         */
        Arrays.sort(name);
       int result= Arrays.binarySearch(name,el);
        System.out.println(Arrays.toString(name));
        System.out.println(result);
       if (result<0){
           System.out.println("Array does not have " + el);
       }else{
           System.out.println("Array has " + el);
       }

    }
}
