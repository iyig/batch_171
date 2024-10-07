package d16datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {
        // Kullanıcdan aldıgınız tarih gecmise ait ise "Gecersiz tarih girdiniz mesaji veriniz
        //Kullanıcıdan aldıgınız tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
      int year= input.nextInt();
       int month=input.nextInt();
       int day=input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);
        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " invalid date");
        }else{
            System.out.println("Enter time for ticket");

        }

  // Kullanıcının girdigi tarihin gün ismini bulan kodu yazınız

        System.out.println("Please enter year, month, and day numbers in the given order");
        int y= input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();
        LocalDate.of(y,m,d);
        System.out.println(givenDate.getDayOfWeek());
    }



}
