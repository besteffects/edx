package objects.companyStructure;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    int headCount;
    ArrayList<Accountant> directReport = new ArrayList<>();

    //Should create a new TechnicalLead that is a Manager. The TechnicalLead's base salary should be 1.3 times that
// of a TechnicalEmployee. TechnicalLeads should have a default head count of 4.
    public TechnicalLead(String name) {
        super(name);
        setBaseSalary(getBaseSalary() * 1.3); //base salary can be protected in head class
        headCount = 4;
    }

    //Should return true if the number of direct reports this manager has is less than their headcount.
    public boolean hasHeadCount() {
        return directReport.size() < headCount;
    }

}

