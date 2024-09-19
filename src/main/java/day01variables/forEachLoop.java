package day01variables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class forEachLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        List<String> list = new ArrayList<>();
        do {
            System.out.println("rakamlardan olusan Stringler giriniz");
            System.out.println("String girmeyi durdurmak icin 'S' giriniz");
            str=scan.next();
            if(!str.equals("S"))
                list.add(str);
        } while(!str.equals("S"));
        System.out.println(list);
int carpim=1;
for(int i=0; i<list.size(); i++){
    carpim=carpim*Integer.parseInt(list.get(i));
}
        System.out.println(carpim);
    }

}

