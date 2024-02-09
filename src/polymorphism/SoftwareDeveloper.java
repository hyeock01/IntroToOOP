package polymorphism;

import java.util.Date;

public class SoftwareDeveloper extends Employee{
    private String specialty;

    public SoftwareDeveloper(String employeeID, long salary, Date startDate, String specialty) {
        super(employeeID, salary, startDate);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println("나는 코딩노예야");
    }

    @Override
    public long getSalary() {
        return super.getSalary() + 20000;
    }

    @Override
    public String toString() {
        return "SoftwareDeveloper{" +
                "specialty='" + specialty + '\'' +
                '}';
    }
}
