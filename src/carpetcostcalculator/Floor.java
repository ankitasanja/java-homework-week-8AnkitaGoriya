package carpetcostcalculator;

/**
 * 17. Carpet Cost Calculator
 * The Carpet Company has asked you to write an application that calculates the price of carpeting for
 * rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
 * the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
 * meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
 * would cost $960.
 */
public class Floor {
    //Write a class with the name Floor. The class needs two fields (instance variables) with name width
    //and length of type double.
    double width;
    double length;

    //The class needs to have one constructor with parameters width and length of type double and it
    //needs to initialize the fields.
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0 && length < 0) { // width parameter is less than 0 it needs to set the width field value to 0,
            this.width = 0;             //in case the length parameter is less than 0 it needs to set the length field value to 0.
            this.length = 0;
        }
    }

    //Method named getArea without any parameters, it needs to return the calculated area
    //(width * length).
    public double getArea() {
        return width * length;
    }
}
