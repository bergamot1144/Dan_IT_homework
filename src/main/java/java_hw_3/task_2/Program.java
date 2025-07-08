package java_hw_3.task_2;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0, b=0, c=0;
        try{
            System.out.println("Input a:");
             a = scanner.nextInt();
            System.out.println("Input b:");
             b = scanner.nextInt();
            System.out.println("Input c:");
             c = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода! Пожалуйста, введите только числа.");
        } finally {
            scanner.close(); // Закрываем Scanner
        }
        if( a< b+   c && b<a+c&&c<a+b)
        {
            System.out.println("We can build triangle");
        } else{
            System.out.println("We can`t build triangle");
        }



    }
}
