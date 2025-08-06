package java_hw_10;

import java.time.LocalDateTime;

import static java_hw_10.DayTime.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("1) Current data (YYYY-MM-DD HH:MM:SS):");
        printCurrentDateTime();

        System.out.println("\n2) Add/Increase data:");
        LocalDateTime base = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime shifted = calculateFutureDateTime(base, 3, 5); // +3 дні, +5 годин
        System.out.println("Now:  " + base);
        System.out.println("After:   " + shifted); //

        System.out.println("\n3) Weekend recheck:");
        System.out.println("2023-10-28 10:00 -> " +
                isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0))); // true (субота)
        System.out.println("2023-10-30 10:00 -> " +
                isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0))); // false (понеділок)

        System.out.println("\n4) Format data:");
        String formatted = formatDateTime(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                "dd-MM-yyyy HH:mm"
        );
        System.out.println(formatted);

        System.out.println("\n5) Difference between data:");
        String diff = calculateDifference(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                LocalDateTime.of(2023, 10, 28, 16, 45)
        );
        System.out.println(diff);
    }
}
