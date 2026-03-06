package se.lexicon;

import java.lang.String;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime {
    static void main() {

        // 1. CURRENT DATE
        LocalDate today = LocalDate.now();
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + today);

        // 2. Formatted date + 25 days
        LocalDate futureDate = today.plusDays(25);
        DateTimeFormatter swedishFormatter =
        DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv"));

        java.lang.String formatted = futureDate.format(swedishFormatter);
        System.out.println("8 dagar har passerat av våren 2026 den: " + formatted);

        // 3. Last Monday + print whole week
        LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);

        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }

        // 4. Parse ISO date
        LocalDate parsedDate = LocalDate.parse("2026-03-21");
        System.out.println("Norouz: " + parsedDate);

        // 5. Birthday + day of week
        LocalDate myBirthday = LocalDate.of(2026, 5, 21);
        DayOfWeek birthdayDay = myBirthday.getDayOfWeek();

        System.out.println("My Birthday: " + myBirthday);
        System.out.println("Day of week: " + birthdayDay);

        // 6. Future + past dates
        LocalDate futurePlus10Years = today.plusYears(10);
        LocalDate pastMinus10Months = today.minusMonths(10);

        System.out.println("Month enum: " + parsedDate.getMonth());
        System.out.println("Month number: " + pastMinus10Months.getMonthValue());

        // 7. Elapsed years between birthday and future date
        Period elapsed = Period.between(myBirthday, futureDate);

        System.out.println("Elapsed Years: " + elapsed.getYears());
        System.out.println("Elapsed Months: " + elapsed.getMonths());
        System.out.println("Elapsed Days: " + elapsed.getDays());

        // 8. Writing period
        Period writingPeriod = Period.of(4, 7, 29);
        System.out.println("Estimated duration: "
                + writingPeriod.getYears() + " years, "
                + writingPeriod.getMonths() + " months, "
                + writingPeriod.getDays() + " days");

        // 9. Current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // 10. Nanoseconds
        int nanos = now.getNano();
        System.out.println("Nanoseconds: " + nanos);

        // 12. Formatted current time
        DateTimeFormatter prettyFormatter =
        DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm", new Locale("sv"));

        java.lang.String prettyDate = nowDateTime.format(prettyFormatter);
        System.out.println("Pretty Date: " + prettyDate);

        // 13. Specific LocalDateTime
        LocalDate specificDate = LocalDate.of(2018, 4, 5);
        LocalTime specificTime = LocalTime.of(10, 0);
        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);

        System.out.println("Specific DateTime: " + specificDateTime);

        // 14. Format specific LocalDateTime
        DateTimeFormatter swedishDateTime =
                DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", new Locale("sv"));

        System.out.println("Formatted Specific DateTime: " + specificDateTime.format(swedishDateTime));
    }
}
