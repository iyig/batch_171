package d13statickeywordconstructors;

public class StaticBlocks01 {

// Bir variable olusturdugunuzda deger atamazsanız o variablei " initialize" etmediniz demektir
static double pi;
static String shape;

static{
    pi=3.14;
    System.out.println("Static block 1");
}
    static{
        shape="Circle";
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {
        // Bazen main method dan calıstırılmadan önce varible ların hazır hale getirilmesi gerekir
        //bu nedenle static block lara ihtiyaz duyabiliriz
        // static variable lar static block lar icinde initialize edilirse o class in ıcınde herseyden önce hazır
        // hale getirilmis olur.

        System.out.println(pi);
        System.out.println("main method");
    }

}
