package d9string_loops;

public class Loops02 {

    public static void main(String[] args) {
        // 5 den 8 e kadar tamsayıların toplamını veren kodu yazınız
        // 5+6+7+8=26


        int sum=0;
        for (int i = 5; i < 9; i++) {
            sum= sum+ i;

        }
        System.out.println(sum);

   // 7 den 9 a dakar tamsyıların carpımını veren kodu yazınız
        // 7*8*9=504

        int multiply=1;
        for (int i = 7; i <10 ; i++) {
             multiply= multiply*i;

        }
        System.out.println(multiply);


// Verilen bir tamsainin rakmalarının toplamını bulan kodu yazınız
        //578== 5+7+8020
        
        int toplam=0;
        for (int i = 578; i >0 ; i=i/10) {
          toplam=toplam+ i% 10;
            
        }
        System.out.println(toplam);
    }

}
