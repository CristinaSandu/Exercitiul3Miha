import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class MainRunner {


    public static void main(String[] args) throws Exception {

        String path = "src/main/resources/Emplyees.csv";
        ArrayList<Person> people = createObjects();
        writeCSV(path, people);
        readCSV(path);

    }


    public static ArrayList<Person> createObjects() {
        Center aria = new Center("Iasi", "Aria");
        Center centro = new Center("Iasi", "Centro");

        Adress adressLiviu = new Adress("333", "3");
        Adress adressCristina = new Adress("222", "2");
        Adress adressIoana= new Adress("111", "10");

        Person cristina = new Person("Cristina Sandu", Arrays.asList("Atp1", "Apt2"), "0110101", "mailCristina@mail.com");
        Person liviu = new Person("Liviu D", Arrays.asList("Atp3", "Apt4"), "0110101", "mailLiviu@mail.com");
        Person ioana = new Person("Ioana Georgescu", Arrays.asList("Apt 6", "Apt 7", "Apt 8"), "44778899", "ioana" +
                "@mail.com");

        Employee employeeLiviu = new Employee(liviu, aria, new Manager(), adressLiviu);
        Manager managerLiviu = new Manager(employeeLiviu, Arrays.asList(centro));

        Employee employeeCristina = new Employee(cristina, aria, managerLiviu, adressCristina);
        Employee employeeIoana = new Employee(ioana, centro, managerLiviu, adressIoana);

        QA qaCristina = new QA(employeeCristina, "Beginner");
        QA qaIoana= new QA(employeeIoana, "Senior");

        ArrayList<Person> softVisionWorkforce = new ArrayList<Person>();

        softVisionWorkforce.add(qaCristina);
        softVisionWorkforce.add(managerLiviu);
        softVisionWorkforce.add(qaIoana);


        return softVisionWorkforce;
    }


    public static ArrayList<String> readCSV(String path) {
        try {
            CSVReader reader = new CSVReader(new FileReader(path));
            ArrayList<String> toReturn = new ArrayList<>();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    toReturn.add(Arrays.toString(nextLine));
                    System.out.println(Arrays.toString(nextLine));
                }
            }
            return toReturn;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Read complete");
        return null;
    }

    public static void writeCSV(String path, ArrayList<Person> people) throws Exception {

        CSVWriter writer = new CSVWriter(new FileWriter(path, true), ',',' ',' ',"\n");

        ArrayList<ArrayList<String>> records = new ArrayList<>();
        for (Person person : people) {
            records.add(ConverterToStringArray.personToCSVLine(person));
        }


        for (ArrayList<String> record : records) {
            writer.writeNext( record.toArray(String[]::new));
        }

        writer.close();
        System.out.println("Write complete");
    }
}





