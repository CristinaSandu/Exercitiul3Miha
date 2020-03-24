import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {

    private String workingCenter;
    private int deskNumber;
    private int workingFloor;
    private String reportingmanager;


    public Employee(String workingCenter, int deskNumber, int workingFloor, String reportingmanager) {    // EMployee
        // without personal Info

        this.workingCenter = workingCenter;
        this.deskNumber = deskNumber;
        this.workingFloor = workingFloor;
        this.reportingmanager=reportingmanager;
    }

    public Employee(String name, List<String> aptitudes, String phonenumber, String email, String workingCenter,
                    int deskNumber, int workingFloor, String reportingmanager){
        super(name,aptitudes,phonenumber,email);
        this.deskNumber=deskNumber;
        this.reportingmanager=reportingmanager;
        this.workingCenter=workingCenter;
        this.workingFloor=workingFloor;
    }



   public Employee(){super();}

    public String getWorkingCenter() {
        return workingCenter;
    }

    public void setWorkingCenter(String workingCenter) {
        this.workingCenter = workingCenter;
    }

    public int getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        this.deskNumber = deskNumber;
    }

    public int getWorkingFloor() {
        return workingFloor;
    }

    public void setWorkingFloor(int workingFloor) {
        this.workingFloor = workingFloor;
    }

    public String getReportingmanager() {
        return reportingmanager;
    }

    public void setReportingmanager(String reportingmanager) {
        this.reportingmanager = reportingmanager;
    }
   /* @Override
    public String toString() {
        return String.format("city - %s, building name - %s,  name - %s, aptitudes - %s, phone number  - %s, manager " +
                        "- %s ",

                center.getCity(),
                center.getBuildingName(),
                mngtInfo.getManagerName()

        );
    } */
}
