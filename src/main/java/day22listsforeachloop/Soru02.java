package day22listsforeachloop;


import java.util.*;

public class Soru02 {
    public static void main(String[] args) {



    /*
Kullanıdan tam ismini alin
Ismın harflerini bir liste ekleyin
Harfleri alfabetik sırada byuk harfler olarak yazın
*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");
        String name= scan.nextLine().replace(" ","").toUpperCase();
        List<Character> harfler= new ArrayList<>();
for (int i=0; i<name.length(); i++){
    harfler.add(name.charAt(i));
}

        System.out.println(harfler);

        Collections.sort(harfler);
        System.out.println(harfler);
    }
}