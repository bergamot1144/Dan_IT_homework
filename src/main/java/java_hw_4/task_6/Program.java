package java_hw_4.task_6;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] array = new int[45];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        int max = array[0];
        int min = array[0];
        System.out.println("Array: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
