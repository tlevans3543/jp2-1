/**
 * Author: Trevor Evans
 * Date: 10/3/2018
 * Time: 8:39 AM
 * Description:
 */

package JP_2_1;

import java.util.Date;

public class Main{

    //Write a static main method that creates two objects, one with the default constructor and the other with the
    //  constructor with parameters. Give sample data for the parameters
    public static void main(String[] args){

        //default chassis
        VehicleChassis myChassisA = new VehicleChassis();

        //overloaded chassis
        VehicleChassis myChassisB = new VehicleChassis("Chassis B");

        //default Frame
        VehicleFrame myFrameA = new VehicleFrame();

        //overloaded frame
        VehicleFrame myFrameB = new VehicleFrame("Ladder Frame");

        //default engine
        ManufacturedEngine myEngineA = new ManufacturedEngine();

        //overloaded engine
        ManufacturedEngine myEngineB = new ManufacturedEngine
                ("Honda", new Date(), "H-Series", "H23A1", 4,
                        "88 AKI", "2WD: Two-Wheel Drives");

        //default interior feature
        InteriorFeature interiorA = new InteriorFeature();

        //overloaded interior feature
        InteriorFeature interiorB = new InteriorFeature("Climate Control");

        //default exterior feature
        ExteriorFeature exteriorA = new ExteriorFeature();

        //overloaded exterior feature
        ExteriorFeature exteriorB = new ExteriorFeature("Fog lamps");

        //default vehicle
        Vehicle myVehicleA = new Vehicle();

        //overloaded vehicle
        Vehicle myVehicleB = new Vehicle(new Date(), "Honda", "Honda",
                "Prelude", myFrameA, null, "2WD: Two-Wheel Drive",
                myEngineB);

        //default car
        Car myCarA = new Car();

        //feature array
        Feature[] bFeatures = {new InteriorFeature("AM/FM Radio"),new InteriorFeature("Air Conditioning"),
                new ExteriorFeature("Wood Panels"), new ExteriorFeature("Moon Roof")};

        //overloaded car
        Car myCarB = new Car(new Date(),"Honda", "Honda", "Prelude",
                myFrameB,"Sports Coupe","2WD: Two-Wheel Drive", myEngineB, bFeatures,2);

//        System.out.println(myChassisA.toString());
//        System.out.println();
//
//        System.out.println(myChassisB.toString());
//        System.out.println();
//
//        System.out.println(myFrameA.toString());
//        System.out.println();
//
//        System.out.println(myFrameB.toString());
//        System.out.println();
//
//        System.out.println(myEngineA.toString());
//        System.out.println();
//
//        System.out.println(myEngineB.toString());
//        System.out.println();
//
//        System.out.println(interiorA.toString());
//        System.out.println();
//
//        System.out.println(interiorB.toString());
//        System.out.println();
//
//        System.out.println(exteriorA.toString());
//        System.out.println();
//
//        System.out.println(exteriorB.toString());
//        System.out.println();
//
//        System.out.println(myVehicleA.toString());
//        System.out.println();
//
//        System.out.println(myVehicleB.toString());
//        System.out.println();
//
//        System.out.println(myCarA.toString());
//        System.out.println();

        System.out.println(myCarB.toString());

    }
}