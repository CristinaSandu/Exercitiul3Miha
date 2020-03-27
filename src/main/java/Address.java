public class Address {
    private String officeNumber;
    private String deskNumber;

    public Address(String officeNumber, String deskNumber) {
        this.officeNumber = officeNumber;
        this.deskNumber = deskNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(String deskNumber) {
        this.deskNumber = deskNumber;
    }

    public String finalAdress(){
        String adress= officeNumber + "-" + deskNumber;
        return adress;
    }

    @Override
    public String toString() {


        String toReturn=String.format("Adress { Office number = %s , Desk number = %s , Adress in the office = %s}",
                officeNumber, deskNumber, finalAdress());
        return toReturn;
    }
}
