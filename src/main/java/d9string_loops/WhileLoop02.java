package d9string_loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {



    /*
3x1=3
3x2=6
3x3=9
...
...
*/

      // Scanner input= new Scanner(System.in);
       // System.out.println("Bir sayi giriniz");
      //  int carpim=input.nextInt();
      //  for (int i = 0; i <carpim ; i++) {
       //     System.out.println(carpim + "x" +i+ "=" +(carpim*i));

/*

        Scanner input1= new Scanner(System.in);
        System.out.println("Çarpim tablosunu görmek icin bir sayi giriniz");
        int num= input1.nextInt();

        int i=1;
        while(i< num){
            System.out.println(num +" x" + i+" ="+(num*i));
            i++;
        }


// Verilen bir string de her harfin sonrasına "*" sembolu ekleyiniz

        // Java ==> J*a*v*a*
        Scanner input2= new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String word= input2.next();
        String newWord="";
        int a=0;
        while(a<word.length()){
        newWord= newWord+word.charAt(a)+ "*";
        a++;
        }
        System.out.println(newWord);
*/
    // Bir string deki takrarsiz karakterleri console yazdırınız
        // kertenkelle ==> rtn
        // indexOf( "k") == 0
        // lastOf("k") == 6 tekrarlı

// indexOf( "r") == 2 tekrarsiz
        // lastOf("") == 2



        String s="kertenkelle";
       String sonuc= "";



        int b=0;
        while(b<s.length()){
            char ch= s.charAt(b);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
sonuc=sonuc+ch;


            }


            b++;
        }
        System.out.println(sonuc);

    }

}