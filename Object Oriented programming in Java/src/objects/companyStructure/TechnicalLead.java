package objects.companyStructure;

public class TechnicalLead extends TechnicalEmployee {
    int headCount;

    //Should create a new TechnicalLead that is a Manager. The TechnicalLead's base salary should be 1.3 times that
// of a TechnicalEmployee. TechnicalLeads should have a default head count of 4.
    public TechnicalLead(String name) {
        super(name);
        setBaseSalary(getBaseSalary() * 1.3); //base salary can be protected in head class
        headCount = 4;
    }
}
