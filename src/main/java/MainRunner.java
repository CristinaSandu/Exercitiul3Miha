import java.util.ArrayList;
import java.util.Arrays;

public class MainRunner {
    public static void main(String[] args) {

        Center aria = new Center("Iasi", "Aria", Arrays.asList(2, 3, 4));
        Center centro = new Center("Iasi", "Centro", Arrays.asList(1));

        Manager liviu = new Manager("Liviu", Arrays.asList("Scrum Master", "QA Manual"), "090909999",
                "liviu@sv.com", aria.getBuildingName(), 2, aria.getFloors().get(2), "SomeoneSuperior",
                Arrays.asList(aria,
                        centro));

        QA cristina = new QA("Cristina", Arrays.asList("QA Manual"), "099097834", "cristina@sv.com",
                aria.getBuildingName(), 20, aria.getFloors().get(0), liviu.getName());



        ArrayList<Person> softVisionWorkforce = new ArrayList<Person>();
        softVisionWorkforce.add(cristina);
        softVisionWorkforce.add(liviu);


        System.out.println(softVisionWorkforce);


    }
}



