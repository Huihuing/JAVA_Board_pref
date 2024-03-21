package main;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.stream.StreamSupport;

public class butil {
    private Scanner scan = new Scanner(System.in);

    public Scanner getScanner() {return scan;}

    public String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");

        String formattedDate = now.format(formatter);

        return formattedDate;
    }
}
