package d9string_loops;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir tamsayı alınız
        Tamsayi 100 den kücük kullanıcıya "kaybettinız mesaji vererek oyunu sonlandırınız
        Tamsayi 100 ve 100 den buyuk  ise "Kazandınız" mesajı vererek oyuna devam ettırınız

         */

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Bir tam sayı giriniz");
            int num = input.nextInt();
            if (num >= 100) {
                System.out.println("Kazandiniz");
            } else {
                System.out.println("Kaybettınız");
                break;

            }
        }while (true) ;


        }
    }
