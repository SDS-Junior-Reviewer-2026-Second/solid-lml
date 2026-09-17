package greeter;

public class NormalGreeting implements Greeting{
    @Override
    public String greet(){
        return "Hello.";
    }
}
