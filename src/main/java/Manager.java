import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public @Data
class Manager extends Employee {
    private ArrayList<Center> secondaryCenters;

    public Manager(Employee employee, List<Center> secondaryCenters) {
        super(employee);
        this.secondaryCenters = new ArrayList<Center>(secondaryCenters);

    }

    public Manager() {
    }

    public ArrayList<Center> getSecondaryCenters() {
        return secondaryCenters;
    }


    public void setSecondaryCenters(ArrayList<Center> secondaryCenters) {
        this.secondaryCenters = secondaryCenters;
    }

    public String getName() {
        if (this.name == null) {
            return "No reporting manager";
        }
        return this.name;
    }

    @Override
    public String toString() {
        String toReturn = String.format("Manager: { Name of Manager = %s, List of aptitudes = %s, Phone number = %s, " +
                        "E-mail " +
                        "= %s," +
                        "City = %s, Building name = %s, Office number = %s, Desk number = %s, Final Adress in the " +
                        "company = %s, " +
                        "Manager = %s}",
                this.getName(), this.getAptitudes().toString(), this.getPhoneNumber(), this.getEmail(),
                this.getWorkingCenter().getCity(), this.getWorkingCenter().getBuildingName(),
                this.getAdress().getOfficeNumber(), this.getAdress().getDeskNumber(), this.getAdress().finalAdress(),
                this.getReportingManager().getName());
        return toReturn;
    }
}