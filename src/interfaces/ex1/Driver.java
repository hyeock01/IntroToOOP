package interfaces.ex1;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Lamborghini");
        House h1 = new House(3);
        Caravan cr1 = new Caravan(5);

        Movable[] movables = {c1, cr1};
        Movable mv1 = movables[0];
           Habitable[] habitables = {h1, cr1};
        for (Movable mv: movables){
            mv.move(10);
        }
        for (Habitable hv: habitables){
            System.out.println(hv.canFit(6));
        }
        System.out.println();


    }

}
