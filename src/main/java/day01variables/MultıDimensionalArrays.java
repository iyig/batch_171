package day01variables;

import java.util.Arrays;

public class MultıDimensionalArrays {
    public static void main(String[] args) {
        int ma[][] = {{11, 5}, {7}, {21, 17, 28}};
        System.out.println(Arrays.deepToString(ma));
        System.out.println(Arrays.toString(ma[2]));
        System.out.println((ma[2][1]));

//   ma Arrayın  tüm elemanları aynı satırda aralarında birer boşluk yazdırınız.

        for (int i = 0; i < ma.length; i++) {
            for (int k = 0; k < ma[i].length; k++) {

                System.out.print(ma[i][k] + " ");
            }
        }
//ma Arrayın  tüm elemanları  toplamını yazdırınız
        int sum = 0;
        for (int i = 0; i < ma.length; i++) {
            for (int k = 0; k < ma[i].length; k++) {
                sum = sum + ma[i][k];
            }

            System.out.println(sum);
        }
    }
}