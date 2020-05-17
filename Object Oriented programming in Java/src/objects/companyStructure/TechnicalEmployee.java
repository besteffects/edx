package objects.companyStructure;

abstract public class TechnicalEmployee extends Employee {
    private int checkInNumber;

    public TechnicalEmployee(String name) {
        super(name, 75000.0);
    }

    public String employeeStatus() {
        return (String.valueOf(this.getEmployeeID()) + " " + this.getName() + " " + "has " + checkInNumber +
                " succcessful check ins." + "\n");
    }

    ;
}
