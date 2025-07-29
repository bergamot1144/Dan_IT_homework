package java_hw_5;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("WELCOME TO GAME!!!");

        System.out.println("Input your name:");

    Scanner scanner = new Scanner(System.in);
    String userName = scanner.nextLine();

    NumbersApplication game = new NumbersApplication(userName);
        game.startGame();
    }

}
