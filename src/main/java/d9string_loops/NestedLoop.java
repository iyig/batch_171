package d9string_loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */

  Scanner input= new Scanner(System.in);
        System.out.println("Satır sayisini giriniz");
        int row= input.nextInt();
        System.out.println("Sutun sayısını girini");
        int column= input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }

}
