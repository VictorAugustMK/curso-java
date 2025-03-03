package dat_time_java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program2 {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-11-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-11-06T18:41:08");
        Instant d06 = Instant.parse("2024-11-11T01:30:00Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,  ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);
        System.out.println("R4 dia = " + r4.getDayOfMonth());
        System.out.println("R4 mes = " + r4.getMonthValue());

    }
}
