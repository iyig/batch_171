package d13statickeywordconstructors;

public class Car {
/*
Constructor nederi?
Classdan object uretmemize yarayan code blockarıdır

Class olsuturdugumuzda java bize otomatık oalrak bir costructor verir. Ama bu constructor gözle görülmez
default consturctor==> "Car(){}" şeklındedir


 */

    String make="Honda";
String model=" Accord";
int year=2024;
boolean hybrid= true;
public  Car(String make, String model, int year, boolean hybrid){
    this.make= make;
    this.model=model;
    this.year=year;
    this.hybrid=hybrid;
}
public  Car(String make, String model){
    this.make=make;
    this.model= model;
}

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
