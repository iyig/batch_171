package d12multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        // İki boyutlu bir array i tek boyutlu bir array e cevriniz.
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};  //==> {5,4,2,3,2}


        // 1.step: iki boyutlu arrayde kac tane eleman oldugunu bulan kodu yazmalıyız


        int toplamElemanSayisi = 0;

        for (int[] w : numbers) {


            toplamElemanSayisi = toplamElemanSayisi + w.length;

        }
        System.out.println(toplamElemanSayisi);

        //2.step: Tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olsturmalıyız
int  newArr[]= new int[toplamElemanSayisi];

        // 3. step: iki boyutlu  arraydeki elemanları  tek boyutlu arraye transfer etmeliyiz
    //int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};
int idx=0;
        for (int []w:numbers ){
    for (int k: w){
newArr[idx]=k;

idx++;
    }

}
        System.out.println(Arrays.toString(newArr));

    }
}