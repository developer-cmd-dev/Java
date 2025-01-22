

public class Main {
    public static void main(String[] args) {
        greet();
        System.out.println(minimum(3,6));
        System.out.println((int) Math.floor(Math.random()*100));
    }

 public static void greet(){
     System.out.println("Hello world");
 }
 static int minimum(int a,int b){
     return   Math.min(a,b);
 }
}