package importantclasses.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {

        // current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // current time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        // current date and time
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println(currentDateAndTime);

        // formatting date and time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTimeFormatter.format(currentDateAndTime);
        System.out.println(formattedDate);

    }
}
