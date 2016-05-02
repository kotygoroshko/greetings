package ua.xai;

import java.time.LocalTime;

/**
 * Created by alex on 02.05.16.
 */
public class Greetings {

    private LocalTime time;

    public String getGreeting() {
        if (time.isBefore(LocalTime.parse("06:00"))) {
            return "Good night, World!";
        } else if (time.isBefore(LocalTime.parse("09:00"))) {
            return "Good morning, World!";
        } else if (time.isBefore(LocalTime.parse("19:00"))) {
            return "Good day, World!";
        } else if (time.isBefore(LocalTime.parse("23:00"))) {
            return "Good evening, World!";
        } else {
            return "Good night, World!";
        }
    }

    public static void main(String... agrs) {
        Greetings greetings = new Greetings();
        greetings.setTime(agrs[0]);
    }

    public void setTime(String time) {
        this.time = LocalTime.parse(time);
    }

    public void setLanguage(String language) {
        ;
    }
}
