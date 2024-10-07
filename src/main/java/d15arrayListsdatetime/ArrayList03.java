package d15arrayListsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

    public static void main(String[] args) {
        // Kullanıcın girdigi harf List'te var ise o harfi "Buldun a cevirin yok ise o harfi Lise ekleyin

        List<String> myList= new ArrayList<>();
     myList.add("A");
     myList.add("H");
     myList.add("J");

Scanner input=new Scanner(System.in);

       do{
           System.out.println("Please enter a letter...");
           String letter=input.next().toUpperCase().substring(0,1);
           if (myList.contains(letter)){
               myList.set(myList.indexOf(letter), "Buldum!");

           }else{
               myList.add(letter);
           }
           System.out.println(myList);
       }while(true);


    }
}
