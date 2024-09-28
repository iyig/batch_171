package d12multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String sutdents[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyahn", "Kayahan"}};

        // Yukarıdaki students arrayınde icinde "m" olan ısımleiri console a yazdırınız

        for (String[] w : sutdents) {

            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }

        }
// Bir Integer multidimensional array olsuturnuz tum elemanların carpımını hesaplayınız
int nums[][]={{5,4},{2,3,2},{7}};
int result=1;
for (int[] w:nums){
    for (int k :w){
      result=  result*k;
    }
}
        System.out.println(result);
    }
}
