package d16datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {
        // Verilen isimlerin ilk harflerini console'a yazdıran method'u olusturunuz
        // Ali Can ==> AC Kemal Han ==>KH

getInitials("Ali Can", "Kemal Han");

    }
public static void getInitials(String... s){
        String initials = "";
    for (String w:s
         ) {
       initials=initials+ w.charAt(0) + w.split(" ")[1].charAt(0);
        System.out.println(initials);
        initials="";
    }
}
}
