package day01variables;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //nested = ic ice geçmiş demektır
       /* *ornek 1:
        Kisi erkek ise;
        i)16 yasindan kucuk ise calismamali
        ii)16 - 65(dahil) arasi calismali
        iii)65 yasindan buyuk ise emekli olmali
        Kisi kadin ise;
        i)18 yasindan kucuk ise calismamali
        ii)18 - 60 (dahil) arasi calismali
        iii)60 yasindan buyuk ise emekli olmali
        Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

/*example 1:
    If the person is male;
          i) If he is younger than 16 years old, he should not work
          ii)Workers between 16 - 65 (inclusive)
          iii) Must retire if over 65 years of age
    If the person is a woman;
         i) If she is under 18 years of age, she should not work
         ii)18 - 60 (inclusive) working age
         iii) Must retire if over 60 years of age
   Based on the gender and age of the person, type the appropriate message into the console */
    Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetini giriniz");
        String gender=input.next();
        System.out.println("Yasınızı giriniz");
        int age= input.nextInt();

        if(gender.equalsIgnoreCase("Erkek")){
           if (age<0){
               System.out.println("Yas sıfırdan kücük olamaz");
           }else if (age<16){
                System.out.println("Çalışmamalı");
           }else if (age<=65){
               System.out.println("Çalışmalı");
           }else{
               System.out.println("Emekli olmalı");
           }
        }else if(gender.equalsIgnoreCase("Kadın")) {
            if (age < 0) {
                System.out.println("Yas sıfırdan kücük olamaz");
            } else if (age < 18) {
                System.out.println("Çalışmamalı");
            } else if (age <= 60) {
                System.out.println("Çalışmalı");
            } else {
                System.out.println("Emekli olmalı");
            }
        }else{
            System.out.println("Sizin için bir farklı tanımlama yapılmadı");
        }



    }

}
