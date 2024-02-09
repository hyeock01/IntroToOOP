package polymorphism;

import java.util.Date;

public class DataScientist extends Employee {

    private String databaseCode;

    public DataScientist(String employeeID, long salary, Date startDate, String databaseCode){
        super(employeeID, salary, startDate);
        this.databaseCode = databaseCode;
    }

    public String getDatabaseCode() {
        return databaseCode;
    }

    public void setDatabaseCode(String databaseCode) {
        this.databaseCode = databaseCode;
    }

    @Override
    public void work() {
        System.out.println("파이썬과 자바와 SQL을 사용해");
    }

    @Override
    public String toString() {
        return "DataScientist{" +
                "databaseCode='" + databaseCode + '\'' +
                '}';
    }
}
