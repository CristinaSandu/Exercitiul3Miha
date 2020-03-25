
public class QA extends Employee {
private String tehnicalLevel;


    public QA(String tehnicalLevel) {
        this.tehnicalLevel = tehnicalLevel;
    }

    public QA(Employee employee, String tehnicalLevel){
        super(employee);
        this.tehnicalLevel = tehnicalLevel;
    }

    public String getTehnicalLevel() {
        return tehnicalLevel;
    }

    public void setTehnicalLevel(String tehnicalLevel) {
        this.tehnicalLevel = tehnicalLevel;
    }

    @Override
    public String toString() {
        String toReturn=String.format("QA: { Name of QA = %s, List of aptitudes = %s, Phone number = %s, E-mail = %s," +
                        "City = %s, Building name = %s, Office number = %s, Desk number = %s, Final Adress in the " +
                        "company = %s, " +
                        "Tehnical level = " +
                        "%s, Manager = %s }",
               this.getName(),  this.getAptitudes().toString(), this.getPhoneNumber(), this.getEmail(),
                this.getWorkingCenter().getCity(), this.getWorkingCenter().getBuildingName(),
                this.getAdress().getOfficeNumber(), this.getAdress().getDeskNumber(), this.getAdress().finalAdress(),
                tehnicalLevel, this.getReportingManager().getName());
        return toReturn;
    }

}
