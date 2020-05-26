package objects.companyStructure;

public class BusinessEmployee extends Employee {
    private double budget;

//    public BusinessEmployee(String name, double baseSalary, double budget) {
//        super(name, baseSalary);
//        this.budget = budget;
//    }

    // Should establish a running tally of the remaining bonusBudget for the team this employee supports. How that budget
// is determined will depend on which type of Business Employee it is
    public double getBonusBudget() {
        return budget;
    }

    public void setBonusBudget(double budget) {
        this.budget = budget;
    }

    //Has a default base salary of 75000
    public BusinessEmployee(String name) {
        super(name, 50000.0);
    }

    // Should return a String representation of this BusinessEmployee that includes their ID, name and the size of their
// currently managed budget. Example: "1 Kasey with a budget of 22500.0"
    public String employeeStatus() {
        return (this.getEmployeeID() + " " + this.getName() + " with a budget of " + this.getBonusBudget());
    }
}
