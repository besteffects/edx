package objects.companyStructure;

public class SoftwareEngineer extends TechnicalEmployee {

    private boolean codeAccess;
    private int successfulCheckIns;

    //Should start without access to code and with 0 code check ins
    public SoftwareEngineer(String name) {
        super(name);
    }

    // Should return whether or not this SoftwareEngineer has access to make changes to the code base
    public boolean getCodeAccess() {
        return codeAccess;
    }

    // Should allow an external piece of code to update the SoftwareEngieer's code privileges to either true or false
    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }

    public int getSuccessfulCheckIns() {
        return successfulCheckIns;
    }

    /*
    Should check if this SoftwareEngineer's manager approves of their check in. If the check in is approved their
    successful checkin count should be increased and the method should return "true". If the manager does not approve the
    check in the SoftwareEngineer's code access should be changed to false and the method should return "false"
     */
//    public boolean checkInCode() {
//if(super.getManager())
//    }

}
