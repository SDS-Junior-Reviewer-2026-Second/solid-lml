package greeter;

import java.util.Map;
import java.util.HashMap;

public class Greeter {

    private String formality;
    private final Map<String, Greeting> greetings;

    public Greeter() {
        this.greetings = new HashMap<>();

        greetings.put("formal", new FormalGreeting());
        greetings.put("casual", new CasualGreeting());
        greetings.put("intimate", new IntimateGreeting());
    }

    public Greeter(Map<String, Greeting> greetings) {
        this.greetings = greetings;
    }

    public String greet() {
        Greeting greeting = greetings.get(formality);

        if (greeting == null) {
            return "Hello.";
        }

        return greeting.greet();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}