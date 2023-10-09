package Software_Design_Patterns.Assignment_2;

public class S extends CoffeeDecorator{
    public S(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " ,Size: S";
    }
    @Override
    public double cost() {
        return coffee.cost();
    }
}
