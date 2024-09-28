package d10arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        int a = 13;
        a = 12;
// Array nasıl lolusturulur?
        String stdNames[] =new String [5];
        System.out.println(stdNames);
        System.out.println(Arrays.toString(stdNames));
// Arrayler diger collectionlardan cok cok daha hizlıdır
        //Arraylar diger collectionlardan daha az memory kullanırlar

   // Array e eleman ekleme nasıl yapılır
        stdNames[2]="Benna";
        stdNames[3]= "Abdullah";
        stdNames[0]="Recep";
        stdNames[4]= "Ugur";
       stdNames[1]= "Yusuf";
        System.out.println(Arrays.toString(stdNames));

        // Arrayden specific bir elemanı a-nasıl laırız
        System.out.println( stdNames[3]);// Abdullah

        // Arraydeki her elemanın sonuna "!" isareti koyarak ekrana yazdırıjjızz

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println( stdNames[i] + "!");

        }


    }
}