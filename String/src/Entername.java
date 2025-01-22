import java.util.Scanner;

public class Entername {

    public static  void main(String args[]){
//        System.out.println("Hello world");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you first name.");
//        String firstname = sc.nextLine();
//        System.out.println("Enter you last name.");
//        String lastname = sc.nextLine();
//        System.out.println("Name is : " + firstname +" "+lastname);

//        String methods.
        String name = "Dev kumar";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        name = "  Dev Kumar    ";
       String newName =  name.trim();
        System.out.println(newName);
        System.out.println(newName.startsWith("Dev"));
        System.out.println(newName.endsWith("Dev"));
        System.out.println(newName.equals("Dev kumar"));
        System.out.println(newName.charAt(4));
        System.out.println(newName.replace('D','M'));
        System.out.println(newName.contains("D"));
        System.out.println(newName.substring(0,5));
        String wordsArr[] = newName.split("");
        for (String words :wordsArr){
            System.out.println(words);
        }


    }



}
