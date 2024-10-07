package d15arrayListsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        //İcinde bulundugumuz zaman dilimindeki tarihi nasıl alırız?

        LocalDate myCurrentDate= LocalDate.now();
        System.out.println(myCurrentDate);//2024-10-03

        //Tarih ten istedigimiz bileseni nasıl alırız?
        int monthValue= myCurrentDate.getMonthValue();
        System.out.println(monthValue);//10

        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);//2024

        int dayValue= myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//3
 //Month bir enum dir
        // Enum java da sabit degerler(Ay isimleri, Gün isimleri,Ulkedeki sehir isimleri) depolamak icın kullanır
        Month monthName=  myCurrentDate.getMonth();
        System.out.println(monthName);//Oktober

         //DayofWeek bir enumdır
       DayOfWeek dayName= myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//Thursday

        //ileri tarihe nasıl dgidirli?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));
        //System.out.println(myCurrentDate.plusDays(5));//2024-10-08

        // Gecmiş tarihe nasıl gidilir

        System.out.println(myCurrentDate.minusYears(20).minusMonths(2).minusDays(5));

        //Specific bir tarih object i nasıl olusturulur?
        LocalDate date1=LocalDate.of(1990,8,10);
        LocalDate date2=LocalDate.of(1980,8,10);

        //bir tarihin bir tarih ten sonra olup olmadıgı nasıl kontrol edılır
        boolean r1=date1.isAfter(date2);
        System.out.println(r1);

       boolean r2= date1.isBefore(date2);
        System.out.println(r2);
     boolean r3=   date1.isEqual(date2);
        System.out.println(r3);
    }

}
