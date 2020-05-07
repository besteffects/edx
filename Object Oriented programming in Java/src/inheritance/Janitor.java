package inheritance;

public class Janitor extends Employee {
//    private int hours;
//    private double salary;
//    private int vacation;

//    public Janitor(int hours, int salary, int vacation) {
//        super(hours, salary, vacation);
//    }

    public int getHours() {
        return super.getHours() * 2;
    }

    public double getSalary() {
        return super.getSalary() - 10000;
    }

    public int getVacationDays() {
        return  super.getVacationDays()/ 2;
    }

    public void clean() {
        System.out.println("Workin' for the man.");
    }

}
