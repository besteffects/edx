package objects.companyStructure;

public class BusinessEmployee extends Employee {
    public BusinessEmployee(String name, double baseSalary, double budget) {
        super(name, baseSalary);
        this.budget = budget;
    }

    public double getBonusBudget() {
        return budget;
    }

    private double budget;

    //Has a default base salary of 75000
    public BusinessEmployee(String name) {
        super(name, 50000.0);
    }

    public String employeeStatus() {
        return (this.getEmployeeID() + " " + this.getName() + " with a budget of " + this.getBonusBudget());
    }
}
