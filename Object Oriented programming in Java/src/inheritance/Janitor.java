package inheritance;

public class Janitor extends Staff {
    public Janitor(int hours, int salary, int vacation){
        super(hours, salary, vacation);
    }

    public int getHours(){
        return super.getHours()*2;
    }
    public int getSalary(){
        return super.getSalary()-10000;
    }
    public int getVacation(){
        return super.getVacation()-5;
    }
    public void clean(){
        System.out.println("Workin' for the man.");
    }
}
