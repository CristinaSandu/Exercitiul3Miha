import lombok.Data;

public @Data
class Employee extends Person {

    private Center workingCenter;
    private Manager reportingManager;
    private Address address;

    public Employee(Person person, Center workingCenter, Manager reportingManager, Address address) {   //constructor
        // pentru person -> employee
        super(person);
        this.reportingManager = reportingManager;
        this.workingCenter = workingCenter;
        this.address = address;

    }

    public Employee (Employee employee){
        super(employee.getName(), employee.getAptitudes(), employee.getPhoneNumber(), employee.getEmail());
        this.workingCenter=employee.getWorkingCenter();
        this.address =employee.getAddress();
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


        @Override
        public String toString() {
            Person p = this;
            String toReturn = String.format("Employee %s { Working center = %s , Reporting manager = %s, Adress = %s}",

                    workingCenter.toString(), reportingManager.toString(), address.toString());

            return toReturn;
        }


    }

