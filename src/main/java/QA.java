import java.util.List;

public class QA extends Employee {
    public QA(){
        super();
    }

    public QA (String name, List<String> aptitudes, String phonenumber, String email, String workingCenter,
               int deskNumber, int workingFloor, String reportingmanager){
        super(name,aptitudes,phonenumber,email,workingCenter,deskNumber,workingFloor,reportingmanager);
    }
}
