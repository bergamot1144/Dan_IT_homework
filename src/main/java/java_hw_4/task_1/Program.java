package java_hw_4.task_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stickyWords = new StringBuilder();
        System.out.println("Input something:");
        while (true) {
            String stickyWord = scanner.nextLine();
            if ("STOP".equals(stickyWord)) {
                break;
            }
            stickyWords.append(stickyWord);
        }
        scanner.close();
        System.out.println(stickyWords);
    }
}