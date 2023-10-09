package Software_Design_Patterns.Assignment_2;

public abstract class Coffee {
    String description = "Description: Simple Coffee";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
