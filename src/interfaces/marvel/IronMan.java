package interfaces.marvel;

public class IronMan extends SuperHero implements Flyable {
    private int numOfSuits;
    private int numOfGFS;

    IronMan(int numOfSuits, int numOfGFS){
        super("Tony Stark");
        this.numOfSuits = numOfSuits;
        this.numOfGFS = numOfGFS;
    }

    @Override
    public void fly(int distance) {
        this.numOfSuits -= distance;
    }

    @Override
    public void fight() {
        this.numOfGFS -= 1;
    }
}
