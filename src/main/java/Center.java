import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public  class Center {

    private  String city;
    private  String buildingName;


    public Center(String city, String buildingName) {
        this.city = city;
        this.buildingName = buildingName;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Override
    public String toString() {
        String toReturn = String.format("Center { City = %s , Building Name = %s }", city,buildingName);
        return toReturn;
    }
}