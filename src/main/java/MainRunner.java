import java.util.Arrays;

public class MainRunner {
    public static void main(String[] args) {

        Center aria = new Center("Iasi", "Aria");
        Center centro = new Center("Iasi", "Centro");

        Address addressLiviu = new Address("333", "3");
        Address addressCristina = new Address("222", "2");

        Person cristina = new Person("Cristina Sandu", Arrays.asList("Atp1", "Apt2"), "0110101", "mailCristina@mail.com");
        Person liviu = new Person("Liviu D", Arrays.asList("Atp3", "Apt4"), "0110101", "mailLiviu@mail.com");
        Person p3 = new Person();
       p3.setPhoneNumber("6484987");
        Employee employeeLiviu = new Employee(liviu, aria, new Manager(), addressLiviu);
        Manager managerLiviu = new Manager(employeeLiviu, Arrays.asList(centro));

        Employee employeeCristina = new Employee(cristina, aria, managerLiviu, addressCristina);
        QA qaCristina = new QA(employeeCristina, "Beginner");


        // System.out.println(qaCristina);
        System.out.println(managerLiviu);

        System.out.println(p3);
    }
}



