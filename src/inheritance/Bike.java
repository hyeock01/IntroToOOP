package inheritance;

public class Bike extends Vehicle{

    private Bike() {
    }

    public Bike(int maxSpeed) {
        this.wheels = 2;
        this.canDrive = true;
        this.canFly = false;
        this.canFloat = false;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("잘가유");
    }

}
