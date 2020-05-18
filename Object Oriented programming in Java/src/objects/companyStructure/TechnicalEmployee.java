package objects.companyStructure;

abstract public class TechnicalEmployee extends Employee {

    public int getCheckInNumber() {
        return checkInNumber;
    }

    private int checkInNumber;
//Has a default base salary of 75000
    public TechnicalEmployee(String name) {
        super(name, 75000.0);
    }
//Should return a String representation of this TechnicalEmployee that includes their ID, name and how many successful
// check ins they have had. Example: "1 Kasey has 10 successful check ins"
    public String employeeStatus() {
        return (String.valueOf(this.getEmployeeID()) + " " + this.getName() + " " + "has " + this.getCheckInNumber() +
                " succcessful check ins." + "\n");
    }


}
