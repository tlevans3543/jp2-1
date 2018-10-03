/**
 * Author: Trevor Evans
 * Date: 10/1/2018
 * Time: 8:40 AM
 * Description:
 */

package JP_2_1;

public interface Chassis {

    // A public constant string named chassis with a value of “Chassis”.
    String chassis = "chassis";

    // The definition of a public getChassisType method that returns an instance of Chassis.
    Chassis getChassisType();

    // The definition of a public setChassisType that accepts a string named vehicleChassis and returns a void
    void setChassisType(String vehicleChassis);

}
