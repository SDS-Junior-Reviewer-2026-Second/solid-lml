package birds;

class Penguin extends Bird implements Swimmable {

    String currentLocation;

    public Penguin(int initialFeatherCount) {
        super(initialFeatherCount);
    }

    @Override
    public void swim() {
        this.currentLocation = "in the water";
    }
}