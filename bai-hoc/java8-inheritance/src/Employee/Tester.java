package Employee;

import java.time.LocalDate;

public class Tester extends Employee{
    private int bug;

    public Tester(int id, String name, LocalDate date, long salary, int bug) {
        super(id, name, date, salary);
        this.bug = bug;
    }

    public int getBug() {
        return bug;
    }

    public void setBug(int bug) {
        this.bug = bug;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + bug;
    }

    @Override
    public long salaryCal() {
        return getSalary() + (bug*100000);
    }
}
