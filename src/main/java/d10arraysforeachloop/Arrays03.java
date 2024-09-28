package d10arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {
        // Bu elemanların en kucugu ile en buyugunun toplamını ekrana yazdırınız


        int ages[]= new int[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=43;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));
     Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);

        //2.yol
        int minimum= ages[0];
        int maximum=ages[1];
        for (int w: ages){
           minimum= Math.min(minimum,w);
           maximum= Math.max(maximum,w);
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(minimum+maximum);


    }
}
