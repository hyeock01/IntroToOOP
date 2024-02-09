package polymorphism;

import java.util.Date;

public class Designer extends Employee {
    private boolean hasUXSkills;

    public Designer(String employeeID, long salary, Date startDate, boolean hasUXSkills) {
        super(employeeID, salary, startDate);
        this.hasUXSkills = hasUXSkills;
    }

    public boolean isHasUXSkills() {
        return hasUXSkills;
    }

    public void setHasUXSkills(boolean hasUXSkills) {
        this.hasUXSkills = hasUXSkills;
    }

    @Override
    public void work() {
        System.out.println("나는 포토샵과 일러스트레이터를 써");
    }

    @Override
    public String toString() {
        return "Designer{" +
                "hasUXSkills=" + hasUXSkills +
                '}';
    }
}
