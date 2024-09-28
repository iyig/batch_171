package d11arrays;

public class Arrays05 {
    public static void main(String[] args) {
        // [o,2,3,0,12,0] sifırları en sona koyunuz [2,3,12,0,0,0]

        int a[]={0,2,3,0,12,0};
        int b[]= new int[a.length];

        int idx=0;

        for (int w:a) {

           if(w!=0){
               b[idx]=w;
               idx++;
           }

        }
    }

}
