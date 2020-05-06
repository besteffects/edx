package inheritance;

public class Staff {
    private int hours=80;
    private int salary=40000;
    private int vacation=10;

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public int getVacation() {
        return vacation;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public Staff(int hours, int salary, int vacation) {
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }
}
