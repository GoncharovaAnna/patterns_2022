package template_method;

public class SomeCafe extends Cafe{
    @Override
    protected void makeCoffee() {
        System.out.println("Make coffee: " + orderOptions.toString());
    }

    @Override
    protected void getPayment() {
        System.out.println("Get paid");
    }
}
