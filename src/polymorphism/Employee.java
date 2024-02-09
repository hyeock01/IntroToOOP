package polymorphism;

import java.util.Date;

public abstract class Employee {
    private String employeeID;
    private long salary;
    private Date startDate;

    public Employee(String employeeID, long salary, Date startDate) {
        this.employeeID = employeeID;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public long getSalary() {
        return salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }
}
