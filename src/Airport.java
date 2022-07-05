import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Airplane> airplanesList;

    public Airport() {
        airplanesList = new ArrayList<>();
    }

    void addAirplanes(Airplane a){
        airplanesList.add(a);
    }

    void deleteAirplanes(Airplane a){
        airplanesList.remove(a);
    }
    public List<Airplane> getAirplanesList(){
        return airplanesList;
    }
}
