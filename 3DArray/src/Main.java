//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student{
    String name;
    int marks;
    int rollno;
}
public class Main {
    public static void main(String[] args) {
//    3d and jagged array
        int arr[][] = new int [3][]; //Jagged array.
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] =(int) (Math.random()*10);
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//        Array of object.
        Student s1 = new Student();
        s1.name = "Dev kumar";
        s1.marks = 90;
        s1.rollno = 1;

        Student s2 = new Student();
        s2.name = "Naman kumar";
        s2.marks = 99;
        s2.rollno = 2;

        Student s3 = new Student();
        s3.name = "Dev kumar";
        s3.marks = 100;
        s3.rollno = 3;

        Student studentArr[] = new Student[3];
        studentArr[0]=s1;
        studentArr[1]=s2;
        studentArr[2]=s3;

//        for (int i = 0; i <studentArr.length ; i++) {
//            System.out.println(studentArr[i].name + " : " + studentArr[i].marks);
//        }

        for (Student value: studentArr){ //Enhanced for loop. called as foreach loop.
            System.out.println(value.name + " : " + value.marks);
        }



    }
}