import java.util.ArrayList;

public class ConverterToStringArray {

    public static ArrayList<String> personToCSVLine(Person p) {
        ArrayList<String> toReturn = new ArrayList<>();
        String aptitudes = parseAptitudes(p.getAptitudes());

        if (p instanceof QA) {
            toReturn.add(p.getName());
            toReturn.add(aptitudes);
            toReturn.add(p.getPhoneNumber());
            toReturn.add(p.getEmail());
            toReturn.add(((QA) p).getWorkingCenter().getCity());
            toReturn.add(((QA) p).getWorkingCenter().getBuildingName());
            toReturn.add(((QA) p).getAdress().getOfficeNumber());
            toReturn.add(((QA) p).getAdress().getDeskNumber());
            toReturn.add(((QA) p).getAdress().finalAdress());
            toReturn.add(((QA) p).getTehnicalLevel());
            toReturn.add(((QA) p).getReportingManager().getName());
        }
            if(p instanceof Manager){
                toReturn.add(p.getName());
                toReturn.add(aptitudes);
                toReturn.add(p.getPhoneNumber());
                toReturn.add(p.getEmail());
                toReturn.add(((Manager) p).getWorkingCenter().getCity());
                toReturn.add(((Manager) p).getWorkingCenter().getBuildingName());
                toReturn.add(((Manager) p).getAdress().getOfficeNumber());
                toReturn.add(((Manager) p).getAdress().getDeskNumber());
                toReturn.add(((Manager) p).getAdress().finalAdress());
                toReturn.add(((Manager) p).getReportingManager().getName());
            }


        return toReturn;
    }

    private static String parseAptitudes(ArrayList<String> aptitudes){
        String aptitudeToReturn = "";
        for (String aptitude : aptitudes){
            aptitudeToReturn += (";" + aptitude);
        }
        aptitudeToReturn = aptitudeToReturn.replaceFirst(";", "");
        return aptitudeToReturn;
    }
}
