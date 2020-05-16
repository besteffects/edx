package lists_arrays.companyStructure;

abstract public class Employee {
    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;
    private String status;

    //Should construct a new employee object and take in two parameters, one for the name of the user and one for their base salary
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    /*
    Should return the employee's ID. The ID should be issued on behalf of the employee at the time they are constructed.
    The first ever employee should have an ID of "1", the second "2" and so on
     */
    public int getEmployeeID() {
        return employeeID = employeeID++;
    }

    //Should return a reference to the Employee object that represents this employee's manager
    public Employee getManager() {
        return manager;
    }

    // Should return true if the two employee IDs are the same, false otherwise
    public boolean equals(Employee other) {
        return this.employeeID == other.employeeID;
    }

    //Should return a String representation of the employee that is a combination of their id followed by their name.
// Example: "1 Kasey"
    public String toString() {
        return this.employeeID + " " + this.name;
    }

    // Should return a String representation of that Employee's current status. This will be different for every
    // subclass of Employee
    abstract public String employeeStatus();
}
