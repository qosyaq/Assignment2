package Software_Design_Patterns.Assignment_2;

public class M extends CoffeeDecorator{
    public M(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " ,Size: M";
    }
    @Override
    public double cost() {
        return coffee.cost() + 3.0;
    }
}
