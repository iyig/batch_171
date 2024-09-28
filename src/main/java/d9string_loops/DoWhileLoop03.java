package d9string_loops;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {
        /*
        Gecerli Username="admin " ve Password= "pwd123"
        Kullanıcıdan username ve passwordu alın
        Username ve Password dogru ise console "Hesabınıza hosgeldiniz
        Username ve password yanlış ise 4 kere Username ve passwordunuzu giriniz mesaji versin
        Username veya password 4.kere yanlış girilirse "Heabiniz bloke olmustur mesaji vererek işlem tamam

         */

        Scanner input= new Scanner(System.in);
 int counter=0;
       do{
         if (counter==4){
             System.out.println("Hesabiniz bloke olmustur");
                     break;
         }

           System.out.println("usermane girin");
           String userName=input.next();

           System.out.println("Password u girini");
           String password= input.next();

          if (userName.equals("admin") && (password.equals("pwd123"))){
           System.out.println("Hesabiniza hos geldiniz");
           break;
       }

counter++;

       }while (true);


    }
}
