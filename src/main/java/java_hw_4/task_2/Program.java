package java_hw_4.task_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        String input = scanner.nextLine();
        char[] nums = input.toCharArray();
        boolean palindrome = true;

        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            if (nums[i] != nums[j]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Number is palindrome");
        } else
            System.out.println("Number is not palindrome");

        scanner.close();
    }
}
