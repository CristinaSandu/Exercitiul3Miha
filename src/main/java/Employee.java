import lombok.Data;


public class Employee extends Person {

    private  Center workingCenter;
    private  Manager reportingManager;
    private  Adress adress;

    public Employee(Person person, Center workingCenter, Manager reportingManager, Adress adress) {   //constructor
        // pentru person -> employee
        super(person);
        this.reportingManager = reportingManager;
        this.workingCenter = workingCenter;
        this.adress=adress;

    }

    public Employee (Employee employee){
        super(employee.getName(), employee.getAptitudes(), employee.getPhoneNumber(), employee.getEmail());
        this.workingCenter=employee.getWorkingCenter();
        this.adress=employee.getAdress();
        this.reportingManager=employee.getReportingManager();

    }

    public Employee() {
        super();
    }

    public Center getWorkingCenter() {
        return workingCenter;
    }

    public void setWorkingCenter(Center workingCenter) {
        this.workingCenter = workingCenter;
    }

    public Manager getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(Manager reportingManager) {
        this.reportingManager = reportingManager;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


        @Override
        public String toString() {
            Person p = this;
            String toReturn = String.format("Employee %s { Working center = %s , Reporting manager = %s, Adress = %s}",

                    workingCenter.toString(), reportingManager.toString(), adress.toString());

            return toReturn;
        }


    }

