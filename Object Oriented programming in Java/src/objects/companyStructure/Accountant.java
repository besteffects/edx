package objects.companyStructure;

public class Accountant extends BusinessEmployee {
    TechnicalLead lead;

    //TODO Should start with a bonus budget of 0 and no team they are officially supporting
    public Accountant(String name) {
        super(name);

    }

    //TODO Should return a reference to the TechnicalLead that this Accountant is currently supporting. If they have
    // not been assigned a TechnicalLead null should be returned
    public TechnicalLead getTeamSupported(){
        return lead;
    }
}
