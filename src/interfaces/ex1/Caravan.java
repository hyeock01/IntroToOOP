package interfaces.ex1;

public class Caravan implements Habitable, Movable{
    private int maxCapacity;
    private int location;

    public Caravan(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Caravan(int maxCapacity, int location) {
        this.maxCapacity = maxCapacity;
        this.location = location;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= maxCapacity;
    }

    @Override
    public void move(int distance) {
        location += distance;
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
