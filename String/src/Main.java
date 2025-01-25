//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Dev";


        String name2 = new String("Dev");
        StringBuffer sb = new StringBuffer("dev");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Kumar");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        sb.delete(0,3);
        System.out.println(sb);


//        System.out.println(name2);
//
//        System.out.println(name.equals(name2));

    }
}