package d9string_loops;

import java.util.Scanner;

public class NestedLoops02 {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
       int row= input.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int column= input.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column; j++) {
                System.out.print( "x ");


            }
            System.out.println();
        }

    }
}
