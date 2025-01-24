//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Inheritance and single Inheritance
class Vehicle{
    String type;
    int price;
    int mileage;
}

class Car extends Vehicle{
    String name;

    public Car(String name,int price,int mileage,String type){
        this.name = name;
        this.price = price;
        this.mileage = mileage;
        this.type = type;
    }

    public void printCarDetail(){
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Milage: "+this.mileage);
        System.out.println("Type: "+this.type);
    }
}


//Multilevel inheritance.
class A{
void a(){
        System.out.println("This is a class");
    }
}

class B extends A{
    void b(){

        System.out.println("This is b class");
    }

}

class C extends B{
    void c(){
        System.out.println("This is c class");
    }
}

//Multiple Inheritance using Interface. java does not have direct access of Multiple inheritance. It creates ambiguity.
interface Cars{
    public void start();
}

class ElectricCar implements Cars{
public void start(){
    System.out.println("Electric car starts");
}
}

class DieselCar implements Cars{

    public void start() {
        System.out.println("Diesel car starts");
    }
}

public class Main {
    public static void main(String[] args) {

        Car superFastCar = new Car("Buggati Chiron",9000000,10,"Car");
        superFastCar.printCarDetail();

        Car milageCar = new Car("Mahindra Scorpio",1700000,40,"Car");
        milageCar.printCarDetail();

        C objOfC = new C();
        objOfC.c();
        objOfC.b();
        objOfC.a();

        Cars Tesla = new ElectricCar();
        Cars XUV700 = new DieselCar();
        Tesla.start();
        XUV700.start();
    }
}