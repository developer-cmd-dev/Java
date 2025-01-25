package AccessModifier;

public class Student {
 private String name;
 private int age;
 private String section;

    public Student(String name, int age, String section){
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public void printStudent(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Section: "+section);
    }


}
