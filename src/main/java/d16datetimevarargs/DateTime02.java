package d16datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
// Anlık zamanı nasıl alırız

        LocalTime myCurrentTime=LocalTime.now() ;
        System.out.println(myCurrentTime);//23:17:43.241505900


        //Anlık zamanda bilsenler nasıl alınır?
      int hour=  myCurrentTime.getHour();
        System.out.println(hour);

        int minutes= myCurrentTime.getMinute();
        System.out.println(minutes);

        int second=myCurrentTime.getSecond();
        System.out.println(second);

        int nano=myCurrentTime.getNano();
        System.out.println(nano);

        //Gelecek ve gecmışe nasıl gidilir
       LocalTime next= myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        // Zaman formatı nasıl degistirilir?

      /*
      dateTime class ta kullanılan tarih saat formatlari
      HH : mm ==> 24 lu saat sistemi
      hh : mm ==> 12 li saat sitemi
      hh : mm  a ==> 12 li saat sistemi Am, PM gösterilir
      HH : mm ==> 24 li saat sisemi
      HH : MM  ==> yanlıs format


    dd-MM-yyyy ==> gun ay yil
    MMM ==> Aug
    MMMM ==> August
       */
       DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("HH : mm");
      String formattedMyCurrentTime= dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formatı nasıl degistirlir?
       LocalDate myDate= LocalDate.of(2023,8,13);
        System.out.println(myDate);//2023-08-13

      //Tarihi AY/gun U/YIl sekline ceviriniz
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMydate =dtf2.format(myDate);
        System.out.println(formattedMydate);//08/13/2023

           // Tarih GUN / AY isminin ilk 3 harfi / Yıl sekline ceviriniz 25/Aug/22

     DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
     String formattedMyTime=dtf3.format(myDate);
        System.out.println(formattedMyTime);
// Tarih GUN / AY isminin  sekline ceviriniz 25/Augustos/2024
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyTimes=dtf4.format(myDate);
        System.out.println(formattedMyTimes);

        //Başka bir zaman dilimindeki tarih ve zamani nasıl alabilirz?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        // Amsterdam ayin kacı?
        LocalDate dateAmsterdam= LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateAmsterdam);

        //Tokyoda saat kaç?
       LocalTime timeInTokyo= LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

      LocalTime timeInAmsterdam=  LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);

    }

}
