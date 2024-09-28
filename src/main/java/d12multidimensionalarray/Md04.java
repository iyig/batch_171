package d12multidimensionalarray;

public class Md04 {
    public static void main(String[] args) {
        // Bir integer multı demensional arraydeki en kücük ve en buyuk elemanların toplamını bulunuz

        int ages [][] = {{15, 4}, {12, 43, 21}};

        int small=ages[0][0];
        int big=ages[0][0];
        for (int [] w: ages){
            for (int k:w) {
              small=  Math.min(small, k);
              big= Math.max(big,k);

            }

        }
        System.out.println(small);
        System.out.println(big);
    }

}
