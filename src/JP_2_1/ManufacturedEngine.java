/**
 * Author: Trevor Evans
 * Date: 10/3/2018
 * Time: 8:55 AM
 * Description:
 */

package JP_2_1;

import java.util.Date;

// a concrete class named ManufacturedEngine that implements the interface Engine.
public class ManufacturedEngine implements Engine {

    //String engineManufacturer;
    private String engineManufacturer;

    //Date engineManufacturedDate;
    private Date engineManufacturedDate;

    //String engineMake;
    private String engineMake;

    //String engineModel;
    private String engineModel;

    //int engineCylinders;
    private int engineCylinders;

    //String engineType;
    private String engineType;

    //String driveTrain;
    private String driveTrain;

    //A public default constructor with no formal parameters and initialize all instance variables with generic
    //  literal values.
    public ManufacturedEngine(){
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineCylinders = 0;
        this.engineType = "85 AKI";
        this.driveTrain = "2WD: Two-Wheel Drive";
    }

    //A public overloaded constructor with values for all of the variables defined above.
    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake,
                              String engineModel, int engineCylinders, String engineType, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    //Public method implementations for all of the public methods found in the Engine interface.
    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    /**
     * A public toString method that returns the following:
     *      Engine Manufacturer : Generic
     *      Engine Manufactured : Thu Feb 02 00:55:44 MST 2012
     *      Engine Make : Generic
     *      Engine Model : Generic
     *      Engine Type : 85 AKI
     *      Engine Cylinders : 0
     *      Drive Train : 2WD: Two-Wheel Drive
     */
    public String toString(){
        return "Engine Manufacturer : " + engineManufacturer +
                "\nEngine Manufactured : " + engineManufacturedDate +
                "\nEngine Make         : " + engineMake +
                "\nEngine Model        : " + engineModel +
                "\nEngine Type         : " + engineType +
                "\nEngine Cylinders    : " + engineCylinders +
                "\nDrive Train         : " + driveTrain;
    }

}
