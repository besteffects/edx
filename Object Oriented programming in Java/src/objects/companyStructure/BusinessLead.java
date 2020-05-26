package objects.companyStructure;

import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    int headCount;
    private ArrayList<Accountant> directReport = new ArrayList<>();

    //Should create a new BusinessLead that is a Manager. The BusinessLead's base salary should be twice that of an
    // Accountant. They should start with a head count of 10.
    public BusinessLead(String name) {
        super(name);
        setBaseSalary(getBaseSalary() * 2);
        headCount = 10;
    }

    //Should return true if the number of direct reports this manager has is less than their headcount.
    public boolean hasHeadCount() {
        return directReport.size() < headCount;
    }

    //Should accept the reference to an Accountant object, and if the BusinessLead has head count left should add this
    // employee to their list of direct reports. If the employee is successfully added to the BusinessLead's direct
    // reports true should be returned, false should be returned otherwise. Each time a report is added the
    // BusinessLead's bonus budget should be increased by 1.1 times that new employee's base salary.
    // That employee's team they are supporting should be updated to reflect the reference to the TechnicalLead given.
    // If the employee is successfully added true should be returned, false otherwise.
    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            directReport.add(e);
            setBonusBudget(getBonusBudget()*1.1);
            return true;
        }
        else return false;
    }
}
