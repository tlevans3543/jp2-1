/**
 * Author: Trevor Evans
 * Date: 10/1/2018
 * Time: 8:50 AM
 * Description:
 */

package JP_2_1;

public class VehicleFrame implements Chassis {

    //Create a String named vehicleFrameType instance variable.
    public String vehicleFrameType;
    //Set the vehicleFrameType instance variable in both constructors,
    // use “Unibody” as the default String value.

    //A public default constructor
    public VehicleFrame(){
        this.vehicleFrameType = "Unibody";
    }

    //An overloaded constructor with the following value:
    //  A String with a parameter value of vehicleFrameType
    public VehicleFrame(String vehicleFrameType){
        this.vehicleFrameType = vehicleFrameType;
    }

    //A public method named getChassisType that didn't have a formal parameter and that returns an instance
    //  of the interface Chassis (hint that would be a copy of this class).
    @Override
    public Chassis getChassisType() {
        return this;
    }

    //A public method setChassisType that takes a String parameter vehicleFrameType and that returns a void.
    //  It should set the instance variable vehicleFrameType.
    @Override
    public void setChassisType(String vehicleChassis) {
        vehicleFrameType = vehicleChassis;
    }

    //A public toString method that returns the following:
    //  Chassis : Chassis
    //  Vehicle Frame : Unibody
    public String toString(){
        return  "Chassis : " + Chassis.chassis +
                "\nVehicle Frame : " + vehicleFrameType;
    }

}
