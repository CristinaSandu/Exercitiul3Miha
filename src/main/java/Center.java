import java.util.ArrayList;
import java.util.List;

public class Center {

    private String city;
    private String buildingName;
    private ArrayList<Integer> floors;


    public Center(String city, String buildingName, List<Integer> floors) {
        this.city = city;
        this.buildingName = buildingName;
        this.floors = new ArrayList<Integer>(floors);
    }

    public String getCity() {
        return city;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public ArrayList<Integer> getFloors() {
        return floors;
    }
}
