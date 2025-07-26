package java_hw_3.task_1;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string1 = scan.next();
        String string2 = scan.next();
        String string3 = scan.next();
        String string4 = scan.next()
                + " " + scan.next()
                + " " + scan.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
    }
}
