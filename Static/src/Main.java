//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Mobile {
    static String  name; //static variable.
    String model;
    int price;

    static {
        name = "Smartphone";
        System.out.println("This is Static block");
    }

    public Mobile(){
        System.out.println("in constructor.");
    }

    public void printMobile() {
        System.out.println(name+":"+model + " : " + price);
    }

    public static  void showMobile(Mobile obj){ //Static method.
        System.out.println("This is static method.");
        System.out.println(name+":"+obj.model + " : " + obj.price);
    }

}


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");


//        Mobile mob1 = new Mobile();
//        mob1.model = "Samsung S24 ultra";
//        mob1.price = 100000;
//        mob1.printMobile();

//        Mobile mob2 = new Mobile();
//         mob2.model = "I phone 1900";
//         mob2.price = 2;
//        mob2.printMobile();
//
//        Mobile.showMobile(mob1);



    }
}