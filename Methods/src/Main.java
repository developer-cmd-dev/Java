
class Calculator{

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }

}

public class Main {
    public static void main(String[] args) {
        greet();
        System.out.println(minimum(3,6));
        System.out.println((int) Math.floor(Math.random()*100));

//        Method overloading.
        Calculator calc = new Calculator();
        System.out.println(calc.add(4,5));
        System.out.println(calc.add(4,5,9));

    }

 public static void greet(){
     System.out.println("Hello world");
 }
 static int minimum(int a,int b){
     return   Math.min(a,b);
 }
}