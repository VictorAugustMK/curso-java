package dat_time_java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program3 {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-11-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-11-06T18:41:08");
        Instant d06 = Instant.parse("2024-11-11T01:30:00Z");

    }
}
