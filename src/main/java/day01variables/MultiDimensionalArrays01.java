package day01variables;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {


        int ma[][]=new int[3][2];
        //Mutltıdimesional arraylar nasıl ekrana yazdırılır

        System.out.println( Arrays.deepToString(ma));

        // Eleman ekleme nasıl yapılur
        ma[0][0]=33;
        System.out.println(Arrays.deepToString(ma));
        ma[1][1]=24;
        System.out.println(Arrays.deepToString(ma));
        ma[0][1]=32;
        System.out.println(Arrays.deepToString(ma));
        ma[1][0]=23;
        System.out.println(Arrays.deepToString(ma));
        ma[2][0]=13;
        System.out.println(Arrays.deepToString(ma));
        ma[2][1]=11;
        System.out.println(Arrays.deepToString(ma));

  // [23][24] arrayını ekrana yazdırınız

        System.out.println(Arrays.deepToString(ma));

        System.out.println(Arrays.toString(ma[1]));

        // multıdmensional arraylarde ıstenen bir eleman yazdırılır
        System.out.println(ma[2][0]);
    }

}
