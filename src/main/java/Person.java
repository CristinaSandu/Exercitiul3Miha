import java.util.ArrayList;
import java.util.List;

public class Person {

    protected String name;
    private ArrayList<String> aptitudes;
    private String phoneNumber;
    private String email;

    public Person(String name, List<String> aptitudes, String phoneNumber, String email) {
        this.name = name;
        this.aptitudes = new ArrayList<String> (aptitudes);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(){}

    public Person(Person person){
        this.name = person.getName();
        this.aptitudes = person.getAptitudes();
        this.phoneNumber = person.getPhoneNumber();
        this.email=person.getEmail();

    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAptitudes() {
        return aptitudes;
    }

    public void setAptitudes(ArrayList<String> aptitudes) {
        this.aptitudes = aptitudes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", aptitudes=" + aptitudes +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
