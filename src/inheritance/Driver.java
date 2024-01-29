package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount("이순혁", 1000000.0, "351467");
        CheckingAccount Acc2 = new CheckingAccount("이순혁", 5238703.3, "1556132", 50000);
        SavingAccount Acc3 = new SavingAccount("이순혁", "7755661",50);

        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());
        System.out.println(Acc3.getBalance());

        Vehicle dudonban = new Car(100);
        Vehicle kawasaki_z7_HVE = new Bike(140);
        Vehicle titanic = new Boat(80);
        Vehicle concord = new Plane(700);

        ArrayList<Vehicle> a = new ArrayList();
        a.add(dudonban);
        a.add(kawasaki_z7_HVE);
        a.add(titanic);
        a.add(concord);

        for(Vehicle v:a){
            v.drive();
        }

        for(Vehicle v:a){
            v.fly();
        }
//
//        Vehicle v = new Vehicle();

    }

}
