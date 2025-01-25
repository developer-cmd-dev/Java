package Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Student student = new Student();
        try{
        student.setData("Dev kumar","A",1,2);
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }
        student.getData();

    }
}
