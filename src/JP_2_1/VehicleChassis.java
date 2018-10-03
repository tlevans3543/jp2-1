/**
 * Author: Trevor Evans
 * Date: 10/1/2018
 * Time: 8:42 AM
 * Description:
 */

package JP_2_1;

public class VehicleChassis implements Chassis {

    //Create a String named chassisName instance variable
    public String chassisName;

    //A public default constructor and an overloaded constructor with the following value:
    //  A String with a parameter value of chassisName.
    //  Set the chassisName instance variable in both, use the interface constant as the default String value.
    public VehicleChassis(){
        this.chassisName = Chassis.chassis;
    }

    public VehicleChassis(String chassisName)   {
        this.chassisName = chassisName;
    }

    //A public method named getChassisType that doesn't have a formal parameter and that returns an instance
    //  of the interface Chassis
    @Override
    public Chassis getChassisType() {
        return this;
    }

    //A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It
    //  should set the instance variable chassisName
    @Override
    public void setChassisType(String vehicleChassis) {
        chassisName = Chassis.chassis;
    }

    //A public toString method that returns the following:
    //  Chassis Name : Chassis
    public String toString(){
        return "Chassis name: " + chassisName;
    }
}

