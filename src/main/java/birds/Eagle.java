package birds;

class Eagle extends Bird implements Flyable  {

    String currentLocation;

    public Eagle(int initialFeatherCount) {
        super(initialFeatherCount);
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

}