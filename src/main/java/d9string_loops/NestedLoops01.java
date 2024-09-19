package d9string_loops;

public class NestedLoops01 {

    public static void main(String[] args) {
        /*
        Week:1
        Day:1
        Day:2
        Day:3
        Week:2
        Day:1
        Day:2
         */

        for (int i = 1; i <5 ; i++) {
            System.out.println("Week :" + i);
            for (int j = 1; j <8 ; j++) {
                System.out.println("Day:" + j);
            }

        }
    }

}
