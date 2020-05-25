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
}
