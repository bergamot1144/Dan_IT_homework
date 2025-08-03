package java_hw_10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DayTime {
    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(fmt));
    }
    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {

        return dateTime.plusDays(days).plusHours(hours);
    }
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek d = dateTime.getDayOfWeek();
        return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
    }
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(fmt);
    }
    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {

        if (end.isBefore(start)) {

            LocalDateTime tmp = start;
            start = end;
            end = tmp;
        }

        Duration duration = Duration.between(start, end);
        long totalMinutes = duration.toMinutes();

        long days = totalMinutes / (24 * 60);
        long hours = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;

        return String.format("Difference: %d days, %d hours, %d minutes", days, hours, minutes);
    }
}
