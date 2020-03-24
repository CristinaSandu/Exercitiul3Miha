import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private ArrayList<Center> secondaryCenters;

    public Manager (String name, List<String> aptitudes, String phonenumber, String email, String workingCenter,
                    int deskNumber, int workingFloor, String reportingmanager, List<Center> secondaryCenters){
        super(name,aptitudes,phonenumber,email,workingCenter,deskNumber,workingFloor,reportingmanager);
        this.secondaryCenters = new ArrayList<Center>(secondaryCenters);

    }

}
