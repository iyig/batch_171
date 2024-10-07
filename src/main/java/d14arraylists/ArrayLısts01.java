package d14arraylists;

import java.util.ArrayList;

public class ArrayLısts01 {
    public static void main(String[] args) {



    /*

Aynı data type  ındaki coklu dataları depolamak icın Array kullanırız
2)Arraylerin negatif bir yonu var, icine koyacagınız eleman sayisini en basta belirlemek zorundasiniz
3)Arraylar eleman sayisinda esnek degildi, bu yuzden java Arraylıst adli yeni bir yapi olusturdul
Bu yapı eleman sayisinda esnekdir. Hic eleman koymazsanız eleman sayisini sifir olarak ayarlar, 1000
eleman koyarsanız eleman sayisını 1000 olarak ayarlarr
4) ArrayList yerine sade List de diyebilirsiniz
) Java Arraylıstleri lolusturduktan sonra Array leri iptal etmedi cunkü
a) Arraylar super hizlıdır
b) Arraylar memory de cok az yer kaplar
c) bu nedenle eleman sayisi belli olan dataları depolamk icin Arraylar tercıh edılır
6) Arrayler primitiv data type ları ve "reference" ları depolayabilir
Ama ArrayList ler non primitive data type ları depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplar

 */
// ArrayList nasıl olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();
        // Arraylist console  nasıl yazdırılır?
        System.out.println(ages);

        // Arraylist lere eleman nasıl eklenir
        // Arraylist lere eleman eklemek icin add() methodunu kullanırız
        //add() methodu elemanları sizin verdiginiz sırada "lıst" e ekler (insertion order
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 45);
        ages.add(888);
        System.out.println(ages);

        //Lıste coklu eleman nasıl eklenir? liste baska bir lıst nasıl eklenir?
        // Bir Lıste coklu eleman eklemek icin o elemanları öncelikle bir listin icıne koymalısınız
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);
        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(2, newAges);
        System.out.println(ages);


        //Arraylist te eleman sayisi nasıl bulunur?
        // size() methodu bir list teki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);

//ArrayList te specific bir eleman nasıl alınır?
        //get() methodu index kullanarak istedimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);

        //Arraylist te specific bir elemanı nasıl degistirebilir?
        ages.set(6, 111);
        System.out.println(ages);

        //Bir listte tum elemanları nasıl silebilir?
        //  ages.clear();
        // System.out.println(ages);

        //Arraylistte specifc bir elemanın var olup olmadıgını nasıl  anlarız
        boolean r = ages.contains(313);
        System.out.println(r);

        //Bir Arraylist in bos olup olmadığını nasıl kontrol edriz

        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Ornek 1: Size verilen bir listin bos olup olmadıgını kontrol eden kodu yazınız
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Ridvan");
        names.add("Enes");
        if (names.size() == 0) {

            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element");
        }
names.clear();
//2.yol
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }
    }
}