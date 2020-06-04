package objects.companyStructure;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    private int headCount;
    private ArrayList<SoftwareEngineer> directReport = new ArrayList<>();

    //Should create a new TechnicalLead that is a Manager. The TechnicalLead's base salary should be 1.3 times that
// of a TechnicalEmployee. TechnicalLeads should have a default head count of 4.
    public TechnicalLead(String name) {
        super(name);
        setBaseSalary(getBaseSalary() * 1.3); //base salary can be protected in head class
        headCount = 4;
    }

    public ArrayList<SoftwareEngineer> getDirectReport() {
        return directReport;
    }

    public void setDirectReport(ArrayList<SoftwareEngineer> directReport) {
        this.directReport = directReport;
    }

    //Should return true if the number of direct reports this manager has is less than their headcount.
    public boolean hasHeadCount() {
        return directReport.size() < headCount;
    }

    //TODO (VERIFY) Should accept the reference to a SoftwareEngineer object, and if the TechnicalLead has head count left
    // should add this employee to their list of direct reports. If the employee is successfully added to the
    // TechnicalLead's direct reports true should be returned, false should be returned otherwise
    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            directReport.add(e);
            return true;
        } else
            return false;
    }

    //TODO (VERIFY) Should see if the employee passed in does report to this manager and if their code access is currently set
    // to "true". If both those things are true, true is returned, otherwise false is returned
    public boolean approveCheckIn(SoftwareEngineer e) {
        if (e.getManager() != null && e.getCodeAccess()) {
            return true;
        } else
            return false;
    }

    //TODO Should check if the bonus amount requested would be approved by the BusinessLead supporting this TechnicalLead.
    // If it is, that employee should get that bonus and true should be returned. False should be returned otherwise
    public void requestBonus(Employee e, double bonus) {
    }

    //Should return a String that gives insight into this Manager and all their direct reports. It should return a
    // string that is a combination of the TechnicalLead's employee status followed by each of their direct employee's
    // status on subsequent lines. If the TechnicalLead has no reports it should print their employee status followed by
    // the text " and no direct reports yet ". Example: "10 Kasey has 5 successful check ins and no direct reports yet".
    // If the TechnicalLead does have reports it might look something like "10 Kasey has 5 successful check ins and is
    // managing: /n 5 Niky has 2 successful check ins"
    public String getTeamStatus() {
        String s = employeeStatus();
        if (directReport.size() == 0) {
            s += "and no direct reports yet\n";
        } else {
            s += " and is managing:\n";
            for (int i = 0; i < directReport.size(); i++) {
                int j = i + 1;
                s += "\t" + j + ". " + directReport.get(i).employeeStatus();
            }
        }

        return s;
    }
}

