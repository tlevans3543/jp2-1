/**
 * Author: Trevor Evans
 * Date: 03-Oct-18
 * Time: 3:30 PM
 * Description:
 */

package JP_2_1;

import java.util.Date;

//A concrete class named Car that extends the Vehicle class
public class Car extends Vehicle{

    //Create the following private instance variables:
    private Feature[] feature = new Feature[10];
    private int carAxle;

    //A public default constructor with no formal parameters and initialize all instance variables with generic
    // literal values by using the super() call.
    public Car(){
        super();
        Feature[] fArray = {new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")};
        feature = fArray;
        carAxle = 2;
    }

    //A public overloaded constructor with a super() method call and instantiation of values for all of the
    // variables defined above.
    public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake, String vehicleModel,
               Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine, Feature[] feature,
               int carAxle) {

        super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType,
                driveTrain, vehicleEngine);
        this.feature = feature;
        this.carAxle = carAxle;
    }

    //Public methods to return formatted strings of the Internal and External features:
    public String getExteriorFeatures(){
        return "\n\t\t\t\t\t: Exterior[Moon Roof]\n\t\t\t\t\t: Exterior[Wood Panels]";
    }

    public String getInteriorFeatures(){
        return "Interior [AM/FM Radio]\n\t\t\t\t\t: Interior [Air Conditioning]";
    }

    //A public toString method that returns the following:
    //      Manufacturer Name   : Honda
    //      Manufactured Date   : Tue Jan 03 07:13:19 MST 2012
    //      Vehicle Make        : Honda
    //      Vehicle Model       : Prelude
    //      Vehicle Type        : null
    //      Engine Manufacturer : Honda
    //      Engine Manufactured : Thu Feb 02 02:00:28 MST 2012
    //      Engine Make         : H-Series
    //      Engine Model        : H23A1
    //      Engine Type         : 88 AKI
    //      Engine Cylinders    : 4
    //      Drive Train         : 2WD: Two-Wheel Drive
    //      Features            : Interior [AM/FM Radio]
    //                          : Exterior [Wood Panels]
    //                          : Interior [Air Conditioning]
    //                          : Exterior [Moonroof]
    //      Car Axle            : 2
    public String toString(){
        String list = "";
        for(int i = 0;i < feature.length; i++){
            if(list.length() == 0){
                list += feature[i];
            }
            else{
                list += "\n\t\t\t\t\t: " + feature[i];
            }
        }
        return super.toString() +
                "\nFeatures            : " + list +
                "\nCar Axle            : " + carAxle;
    }
}
