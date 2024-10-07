package d16datetimevarargs;

public class Varargs01 {

    public static void main(String[] args) {
        System.out.println(add(2, 3, 4,5,6));

        // Note1) Bir method parantezinde birden fazla Varargs kullanılamaz
        //Note2) Eger bir method parantezinde birden fazla parametre kullanılacaksa Varargs sonda olmalıdır
    }
public static int add( int... a){
int sum=0;
    for (int w:a) {
        sum= sum + w;
    }
return sum;
    }
    // Asagıdaki gibi faarklı methodlar olsturarak iş yapamayız
    //cünkü kullanici farkli sayıdaki sayıları toplmak isteyebilir
    //her ihtimal icin bir method olusturmak mümkün degildir
   // java farklı sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapıya Varargs denir.
    // varargs arkada Array yapısını kullanır


    //toplma islemi yapan bir method olusturun

  /*
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
*/
    }

