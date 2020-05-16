package lists_arrays.companyStructure;

public class Employee {
    private String name;
    private double baseSalary;

    //Should construct a new employee object and take in two parameters, one for the name of the user and one for their base salary
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public String getName(){
        return name;
    }
}
