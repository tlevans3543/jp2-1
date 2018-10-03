/**
 * Author: Trevor Evans
 * Date: 03-Oct-18
 * Time: 2:47 PM
 * Description:
 */

package JP_2_1;

import java.util.Date;

//a concrete class named Vehicle that implements the Engine and Chassis interfaces
public class Vehicle implements Engine, Chassis{

    //Create the following private instance variables:
    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

    /**
     * A public default constructor with no formal parameters and initialize all instance variables with generic
     *  literal values
     */
    public Vehicle() {
        this.vehicleManufacturedDate = new Date();
        this.vehicleManufacturer = "Generic";
        this.vehicleMake = "Generic";
        this.vehicleModel = "Generic";
        this.vehicleFrame = new VehicleFrame();
        this.vehicleType = "None";
        this.driveTrain = "Generic";
        this.vehicleEngine = new ManufacturedEngine();
    }

    /**
     * A public overloaded constructor with values for all of the variables defined below.
     *
     * @param vehicleManufacturedDate
     * @param vehicleManufacturer
     * @param vehicleMake
     * @param vehicleModel
     * @param vehicleFrame
     * @param vehicleType
     * @param driveTrain
     * @param vehicleEngine
     */
    public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake, String vehicleModel,
                   Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.driveTrain = driveTrain;
        this.vehicleEngine = vehicleEngine;
    }

    //Public method implementations for the Chassis interface
    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        vehicleFrame.setChassisType(vehicleChassis);
    }

    //Public method implementations for all of the public methods found in the Engine interface.
    @Override
    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        vehicleEngine.setEngineManufacturer(manufacturer);
    }

    @Override
    public void setEngineMake(String engineMake) {
        vehicleEngine.setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        vehicleEngine.setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        vehicleEngine.setDriveTrain(driveTrain);
    }

    @Override
    public void setEngineType(String fuel) {
        vehicleEngine.setEngineType(fuel);
    }

    //A public toString method that returns the following:
    //      Manufacturer Name   : Generic
    //      Manufactured Date   : Thu Feb 02 01:38:31 MST 2015
    //      Vehicle Make        : Generic
    //      Vehicle Model       : Generic
    //      Vehicle Type        : None
    //      Engine Manufacturer : Generic
    //      Engine Manufactured : Thu Feb 02 01:38:31 MST 2015
    //      Engine Make         : Generic
    //      Engine Model        : Generic
    //      Engine Type         : 88 AKI
    //      Engine Cylinders    : 0
    //      Drive Train         : 2WD: Two-Wheel Drive
    public String toString(){
        return "Manufacturer Name : " + vehicleManufacturer +
                "\nManufactured Date   : " + vehicleManufacturedDate +
                "\nVehicle Make        : " + vehicleMake +
                "\nVehicle Model       : " + vehicleModel +
                "\nVehicle Type        : " + vehicleType +
                "\n" +vehicleEngine;
    }

}
