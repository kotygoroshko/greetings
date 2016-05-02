package steps.serenity;

import ua.xai.Greetings;

/**
 * Created by alex on 02.05.16.
 */
public class TechSteps {

    private Greetings greetings;

    public TechSteps() {
        greetings = new Greetings();
    }

    public void setTime(String time) {
        greetings.setTime(time);
    }

    public void run() {
    }

    public String getGreeting() {
        return greetings.getGreeting();
    }
}
