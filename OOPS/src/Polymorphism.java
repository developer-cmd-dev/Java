
//Method overloading in polymorphism.
class OverLoadingDemo{
    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    void sum(int a,int b,int c ,int d){
        System.out.println(a+b+c+d);
    }
}

//Method overriding in polymorphism.
class Bank{
    void rateOfInterest(){
        System.out.println("Rate of interest Of Bank is 5%");
    }
}

class SBI extends Bank{
    @Override
    void rateOfInterest(){
        System.out.println("Rate of interest Of SBI is 10%");
    }
}
class UNION extends Bank{
    void rateOfInterest(){
        System.out.println("Rate of interest Of UNION is 20%");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
    OverLoadingDemo sumOfNum = new OverLoadingDemo();
    sumOfNum.sum(2,3);
    sumOfNum.sum(2,3,5);
    sumOfNum.sum(2,3,5,8);

    Bank bank = new Bank();
    SBI sbiBank = new SBI();
    UNION unionBank = new UNION();

    bank.rateOfInterest();
    sbiBank.rateOfInterest();
    unionBank.rateOfInterest();




    }
}
