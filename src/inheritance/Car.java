package inheritance;

public class Car extends Vehicle{

    private Car() {
    }

    public Car(int maxSpeed) {
        this.wheels = 4;
        this.canDrive = true;
        this.canFly = false;
        this.canFloat = false;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("굴러가유");
    }

}
