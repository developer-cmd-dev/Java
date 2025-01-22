//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//    1. Java Exceptions
//    2. Java Exception Handling
//    3.try...catch block
//    finally block
//    throw and throws keyword.


//        try-catch block
//        int a[] = new int[5];
//        try{
//            int result = 5/0;
//            System.out.println(a[8]);
//        }catch (ArrayIndexOutOfBoundsException error){
//            System.out.println("Tried to access the out of bound element.\n"+error.getMessage());
//        }catch (ArithmeticException error){
//            System.out.println(error.getMessage());
//        }
//        System.out.println("Hello java");

//        finally block exception
    int a[] = new int[5];
    try{
        System.out.println(a[8]);
    }catch (ArrayIndexOutOfBoundsException error){
        System.out.println(error.getMessage());
    }finally {
        System.out.println("Finally block run always.");
    }




    }
}