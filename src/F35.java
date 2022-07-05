public class F35 extends Airport implements Airplane,Passenger{
    public String f35 = "Raptor";
    private int maxPassenger = 2;
    private int passеnger;
    public void f35() {

    }

    @Override
    public void takeOff() {
        System.out.println("Борт " + f35 + " в воздухе, направление к цели");
    }

    @Override
    public void landing() {
        System.out.println("Борт " + f35 + " заходит на посадку");
    }

    @Override
    public void addPassenger(int passenger) {
        if (passenger == 1){
            this.passеnger = passenger;
            System.out.println("Главный Пилот " + f35 + " в кабине");
        }
        else if (passenger == 2){
            System.out.println("Второй Пилот " + f35 + " в кабине");
        }
        else {
            System.out.println("Осталось место только для боеголовок");
        }
    }
}
