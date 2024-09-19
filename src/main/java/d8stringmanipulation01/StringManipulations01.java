package d8stringmanipulation01;

public class StringManipulations01 {
    public static void main(String[] args) {


//Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
    //Example 1: Convert the word "money" in String "s" to "dollar".

    //replace() methodu, 2.parametredekini 1.nin yerine koyar.
    //Kucuk buyuk harfe duyarlidir

    String s = "Learn Java earn money";

    String s1 = s.replace("money", "dollar");
        System.out.println(s1); //Learn Java earn dollar

    //--------------------------
    //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.
    //Example 2: Delete all "e" letters in the string "s".

    String s2 = s.replace("e", ""); //"" hiclik
        System.out.println(s2); //Larn Java arn mony

        /*
        Meshur Regex'ler (Regular Expression):
Bir grup data'yi almak icin kullanilir

    1) Tum rakamlar ==> [0-9]
    2) Tum kucuk harfler ==> [a-z]
    3) Tum buyuk harfler ==> [A-Z]
    4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
    6) Tum noktalama isaretleri ==> \\p{Punct}
    7) Tum sesli harfler ==> [aeiouAEIOU]
       Tum a, x, y harfleri ==> [axy]
 a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
    8) Tum kucuk harfler haric: ==> [^a-z]
    9) Tum harfler haric ==> [^a-zA-Z]

Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
    Sadece space karakteri : \\s
    Space karakteri haric  : \\S
    Sadece rakamlar        : \\d  (digit ten geliyor)
    Rakamlar haric         : \\D
*/

}
}