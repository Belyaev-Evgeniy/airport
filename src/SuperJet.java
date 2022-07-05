public class SuperJet extends Airport implements Airplane,Passenger{
    private String jet007 = "jet007";
    private int maxPassenger = 10;
    private int passenger;

    public SuperJet() {
    }

    @Override
    public void takeOff() {
        System.out.println("Рейс мажора" + jet007 + " вылетел в пункт назначения.");
    }

    @Override
    public void landing() {
        System.out.println("Рейс мажора" + jet007 + " вылетел в пункт назначения.");
    }

    @Override
    public void addPassenger(int passenger) {
        if (passenger<=maxPassenger){
            this.passenger = passenger;
            System.out.println("Мажор на борту рейса " + jet007);
        }
        else {
            System.out.println("Мажор не любит много народу на борту, извините.");
        }
    }
}
