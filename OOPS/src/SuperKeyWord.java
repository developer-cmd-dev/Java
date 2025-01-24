//To invoke parent class variable.
class Animal{
    String color = "White";
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    String color = "Black";
     Dog(){
        System.out.println(color);
        System.out.println(super.color);
        super.eat();
    }


}


public class SuperKeyWord {

    public static void main(String[] args) {

        Dog dog  = new Dog();

    }
}
