package Software_Design_Patterns.Assignment_2;

public abstract class CoffeeDecorator extends Coffee{
    Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription(){
        return coffee.getDescription();
    }
}
