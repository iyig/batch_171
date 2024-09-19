package d9string_loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {



    /*
3x1=3
3x2=6
3x3=9
...
...
*/
Scanner input= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int carpim=input.nextInt();
        for (int i = 0; i <carpim ; i++) {
            System.out.println(carpim + "x" +i+ "=" +(carpim*i));

        }
    }

}