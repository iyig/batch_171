package day01variables;

public class OdevSorusu01 {
    public static void main(String[] args) {
        /*
Aşagıdaki multı dimensional array'ın lerındeki tüm elemanları toplamaı birer birer bulan her bir sonucu yeni bir array'ı ekrana
yazdıran  bir program yazınız.
{{1,2,3},{4,5},{6,7}}==> 1+2+3   4+5     6+7  {6,9,13}
 */

      int arr[][]=  {{1,2,3},{4,5},{6,7}};
      int sum=0;
      int sonuc[]=new int[arr.length];
      for(int i=0; i<arr.length; i++){
          for(int k=0; k<arr.length; k++){

              sum= sum+ arr[i][k];
              sonuc[i]=sum;
              sum=0;
          }
      }


    }


}
