package polymorphism;

import java.util.Date;

public class Driver {

    public static void main(String[] args) {
        SoftwareDeveloper rick = new SoftwareDeveloper("50", 70000, new Date(), "full stack");
        Designer jeck = new Designer("35", 70000, new Date(), true);
        ProductManager tom = new ProductManager("51", 70000, new Date(), "#123");
        DataScientist kim = new DataScientist("30", 70000, new Date(), "#321");

        Employee[] dreamTeam = {rick,jeck,tom,kim};

        int totalSalary = 0;

        for (Employee employee : dreamTeam) {
            totalSalary += (int) employee.getSalary();
        }

        System.out.println("totalSalary는" + totalSalary + "임!");
        System.out.println(((SoftwareDeveloper)dreamTeam[0]).getSpecialty());

        for (Employee e : dreamTeam) {
            e.work();
        }
    }



}
