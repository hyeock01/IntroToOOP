package inheritance;

public class Plane extends Vehicle{

    private Plane() {
    }

    public Plane(int maxSpeed) {
        this.wheels = 3;
        this.canDrive = false;
        this.canFly = true;
        this.canFloat = false;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("날라가유");
    }

    @Override
    public void fly() {
        System.out.println("떳슈");
    }
}
