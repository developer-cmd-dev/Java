package Encapsulation;

import javax.management.InvalidAttributeValueException;

public class Student {
    private String name;
    private String section;
    private int rollNo;
    private int age;

    public void getData(){
        System.out.println(name);
        System.out.println(section);
        System.out.println(rollNo);
        System.out.println(age);
    }

    public void setData(String name,String section, int rollNo ,int age)   {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
        if(age >= 0){
            this.age = age;
        }else{
            throw new IllegalArgumentException("Age must be positive value.");
        }
    }


}
