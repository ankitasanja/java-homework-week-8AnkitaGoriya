package carpetcostcalculator;

public class Carpet {
    //Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
    //type double.
    double cost;

    //The class needs to have one constructor with parameter cost of type double and it needs to initialize
    //the field. In case the cost parameter is less than 0 it needs to set the cost field value to 0.
    public Carpet(double cost) {
        this.cost = cost;

        if (cost < 0) {
            this.cost = 0;
        }
    }

    // Method named getCost without any parameters, it needs to return the value of cost field
    public double getCost() {
        return cost;
    }
}
