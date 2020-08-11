
package com.adam.project4;

/**
 * Date: 8/11/2020
 * Class: CMIS 242
 * 
 *
 * @author Adam Benalayat. 
 * 
 * This class implements the functionality outlined in the interface StateChangeable, using the enumerated type defined in the Status file.
 * 
 * The purpose fo this program is to create a basic database of real estate transactions, storing the address, number of bedrooms, square footage, and price
 * 
 * 
 */
public class Property implements StateChangeable<Status>{
    private String address;
    private int NumBedrooms;
    private int Squarefootage;
    private int price;
    private Status status;

    public Property(String address, int NumBedrooms, int Squarefootage, int price) {
        this.address = address;
        this.NumBedrooms = NumBedrooms;
        this.Squarefootage = Squarefootage;
        this.price = price;
        this.status = Status.FOR_SALE;
    }

    @Override
    public void changeState(Status t) {
        this.status = t;
    }

    @Override
    public String toString() {
        return "Property Address: " + this.address + "\n" + "Number of bedrooms: " + String.valueOf(this.NumBedrooms) + "\n" + "Square Footage: " + String.valueOf(this.Squarefootage)+ "\n" + "Price: " + String.valueOf(this.price) + "\n" + "Current Status: " + this.status.toString();
    }
    
    
    
    
    
    
}
