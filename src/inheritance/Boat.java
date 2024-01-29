package inheritance;

public class Boat extends Vehicle{

    private Boat() {
    }

    public Boat(int maxSpeed) {
        this.wheels = 0;
        this.canDrive = false;
        this.canFly = false;
        this.canFloat = true;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("흘러가유");
    }

}
