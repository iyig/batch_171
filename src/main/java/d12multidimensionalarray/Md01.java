package d12multidimensionalarray;

import java.util.Arrays;

public class Md01 {


    public static void main(String[] args) {

//Bir Array in elemanları array ise bu Arrayler Multıdimensional Arraydır
        // Multidimensional array nasıl olusturulur
        int a[][]= new int[3][2];

        //Multidimensional Array lere eleman nasıl eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        // Multıdimensional Array nasıl yazdırılır?
        System.out.println(Arrays.toString(a)); //[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]
        //multidimensional arraylari console a yazdırmak ıcın toString() methodu degil deepToString() methodunu
        // Multidimensional Array icinden specific bir eleman nasıl yazdırılır?

        System.out.println(a[1][1]);//45
        System.out.println(a[2][1]);

        //Multidimensional array icindeki bir array nasıl yazdırılır
        System.out.println(Arrays.toString(a[0]));//[5,12];

        // Kısa yoldan Multıdemensional array nasıl olusturulur?
        String students[][] ={{"Ali","Kemal"}, {"Cemal"},{"Ayhan", "beyhan", "Seyhan"},{"Ceyhan", "Kayahan"}};

        // Yukarıdaki students arrayinde toplman kac ısım oldugunu bulunuz


       int sum=0;
        for(String[] w:students){
          sum=sum+  w.length;

        }
        System.out.println(sum);
    }
}