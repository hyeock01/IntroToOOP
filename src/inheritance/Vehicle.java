package inheritance;

public abstract class Vehicle {
    protected int wheels;
    protected boolean canDrive;
    protected boolean canFly;
    protected boolean canFloat;
    protected int maxSpeed;
    
    public abstract void drive();

    public void fly(){
        System.out.println("뜨다말았슈");
    }
}
