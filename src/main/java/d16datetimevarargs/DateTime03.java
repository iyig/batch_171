package d16datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {


        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); //2024-10-07T22:01:28.972123300
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy  hh:mm");
        String formattedLdt=dtf.format(ldt);
        System.out.println(formattedLdt);
    }

}
