/**
 * Author: Trevor Evans
 * Date: 03-Oct-18
 * Time: 2:33 PM
 * Description:
 */

package JP_2_1;

//A concrete class named ExteriorFeature that implements the interface Feature.
public class ExteriorFeature implements Feature {

    //Create a String named exteriorFeature as an instance variable
    private String exteriorFeature;

    //A public default constructor without parameters that sets the exteriorFeature instance variable.
    public ExteriorFeature(){
        this.exteriorFeature = "Generic";
    }

    //An overloaded constructor with the following value:
    //  A String with a parameter value of exteriorFeature
    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    //A public method named getFeature that doesnt have a formal parameter and that returns an instance of String.
    @Override
    public String getFeature() {
        return exteriorFeature;
    }

    //A public method setFeature that takes a String parameter exteriorFeature and that returns a void. It should
    //  set the instance variable exteriorFeature.
    @Override
    public void setFeature(String feature) {
        this.exteriorFeature = feature;
    }

    //A public toString method that returns the following:
    //      Exterior [Generic]
    public String toString(){
        return "Exterior [" + exteriorFeature + "]";
    }
}
