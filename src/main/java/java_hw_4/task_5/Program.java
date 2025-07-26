package java_hw_4.task_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int[] numbers = new int[9];

        Random random = new Random();
        for (int index = 0; index < numbers.length; index++) {
            int num = random.nextInt(101);
            numbers[index] = num;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input random number from 0 to 100:");
        int input = scanner.nextInt();
        boolean inArray = false;
        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                inArray = true;
            }
        }

        System.out.println(Arrays.toString(numbers));

        if (inArray) {
            System.out.println("Your number is in the array.");
        } else System.out.println("Your number is not in the array.");
    }
}
