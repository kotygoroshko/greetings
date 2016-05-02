package ua.xai;

import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by alex on 02.05.16.
 */
public class Greetings {

    private LocalTime time;
    private ResourceBundle messages;

    public String getGreeting() {
        if (time.isBefore(LocalTime.parse("06:00"))) {
            return messages.getString("night");
        } else if (time.isBefore(LocalTime.parse("09:00"))) {
            return messages.getString("morning");
        } else if (time.isBefore(LocalTime.parse("19:00"))) {
            return messages.getString("day");
        } else if (time.isBefore(LocalTime.parse("23:00"))) {
            return messages.getString("evening");
        } else {
            return messages.getString("night");
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
        Locale currentLocale = new Locale(language);
        messages = ResourceBundle.getBundle("Greetings", currentLocale);
    }
}
