package Software_Design_Patterns.Assignment_2;

public class Espresso extends Coffee{
    String description = "Description: Espresso";
    double cost = 6.0;

    public Espresso() {
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return cost;
    }
}
