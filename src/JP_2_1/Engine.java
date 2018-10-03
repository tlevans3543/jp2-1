package JP_2_1;

import java.util.Date;

public interface Engine {

    //Create an interface Engine with the following list of public method definitions that return a void.
    void setEngineCylinders(int engineCylinders);
    void setEngineManufacturedDate(Date date);
    void setEngineManufacturer(String manufacturer);
    void setEngineMake(String engineMake);
    void setEngineModel(String engineModel);
    void setDriveTrain(String driveTrain);
    void setEngineType(String fuel);
}
