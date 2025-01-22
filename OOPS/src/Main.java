import java.sql.Struct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Object oriented programming.");
        Student s1 = new Student();
        s1.name = "Dev";
        s1.age = 45;
        s1.printName();
        s1.printAge();


    }
}
class Pen{
    String color;
    String type;
    public  void write(){
        System.out.println("Writing something.");
    }

    public  void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    char section;

    public void printName(){
        System.out.println(this.name);
    }

    public void printAge(){
        System.out.println(this.age);
    }

}

