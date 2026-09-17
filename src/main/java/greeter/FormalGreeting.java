package greeter;

public class FormalGreeting implements Greeting{
    @Override
    public String greet(){
        return "Good evening, sir.";
    }
}
