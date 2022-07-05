public class Boing extends Airport implements Airplane, Passenger{
    private String boing437 = "437-B";
    private int maxPassenger = 437;
    private int passenger;

    public Boing() {
        takeOff();
        landing();
    }

    @Override
    public void takeOff() {
        System.out.println("Рейс " + boing437 + " вылетел в пункт назначения.");
    }

    @Override
    public void landing() {
        System.out.println("Рейс" + boing437 + " заходит на посадочную полосу.");
    }


    @Override
    public void addPassenger(int passenger) {
        if (passenger<=maxPassenger){
            this.passenger = passenger;
            System.out.println("пассажиры на борту рейса " + boing437);
        }
        else {
            System.out.println("Он не резиновый, место осталось только в грузовом");
        }
    }
}
