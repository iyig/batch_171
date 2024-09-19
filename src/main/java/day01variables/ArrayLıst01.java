package day01variables;

import java.util.ArrayList;
import java.util.List;

public class ArrayLıst01 {

    public static void main(String[] args) {
       // ArrayList<Integer>list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        System.out.println(list2);

       //Lıst2 eleman ekleme nasil yapılır?

        list2.add("12");
        System.out.println(list2);
        list2.add("A");
        System.out.println(list2);//[12, A]
        list2.add("B");
        System.out.println(list2); //[12, A, B]

        // Herhangi bir ındexe eleman ekleme nasıl yapılır
        list2.add(1,"X");
        System.out.println(list2);
        list2.add(0,"Mustafa");
        System.out.println(list2);
       // Listlerde  eleman sayısını bulmak nasıl yapılır
        list2.size();
        System.out.println(list2.size());
        list2.remove("A");
        System.out.println(list2);
        // remove() eleman ne return eder
        System.out.println(list2.remove("B"));

        // Bir list bos olup olmadığını nası anlarız
        list2.isEmpty();
        System.out.println(list2.isEmpty());
        // Bir listden istenen elemani silme
        System.out.println(list2.remove(0));
        //
        System.out.println(list2);
        list2.add("B");
       list2.remove("B");
        System.out.println(list2);
        list2.remove("W");// Javadan olmayan bir elemanı remove etmesini isterseniz
                          // remove edemez ve List aynen oldugu gibi birakir
        System.out.println(list2);

        //remove() ne return eder
        // list2== [A,C,B]

        System.out.println(list2.remove(1));
        System.out.println(list2.remove("B"));


    }

}
