package observer;

public class WebTaxiTreckerApp implements Observer{
    @Override
    public void Update(Coordinates coordinates, int taxiId) {
        //...
        System.out.println(this.getClass().getName() + ": ID " + taxiId + " with coordinates:" + coordinates.toString());
    }
}
