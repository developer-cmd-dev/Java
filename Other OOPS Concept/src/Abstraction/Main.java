package Abstraction;

abstract class Car{
    abstract public void fuelType();
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Abstraction");
        Tata tata = new Tata();
        tata.fuelType();
    }



}
