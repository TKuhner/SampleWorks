package SampleWorks.Java;

import java.time.*;
import java.util.*;

public class FindDate {

    public static String findDay(int month, int day, int year) {

        LocalDate localDate = LocalDate.of(year, month, day);

        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstMultipleInput = sc.nextLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);
    }
}
