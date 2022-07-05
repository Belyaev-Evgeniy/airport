import java.util.List;

public class Start {
    public static void main(String[] args) {
        Airport domodedovo = new Airport();

        domodedovo.addAirplanes(new Boing());
        domodedovo.addAirplanes(new F35());
        domodedovo.addAirplanes(new SuperJet());


        List<Airplane> airplaneList = domodedovo.getAirplanesList();
        ((Passenger)airplaneList.get(0)).addPassenger(656);
        ((Passenger)airplaneList.get(1)).addPassenger(2);
        ((Passenger)airplaneList.get(2)).addPassenger(5);


    }
}