/**
 * Author: Trevor Evans
 * Date: 03-Oct-18
 * Time: 2:22 PM
 * Description:
 */

package JP_2_1;

//A concrete class named InteriorFeature that implements the interface Feature.
public class InteriorFeature implements Feature{

    //Create a String named interiorFeature as an instance variable.
    private String interiorFeature;

    //A public default constructor without parameters that sets the interiorFeature instance variable to “Generic”
    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }

    //An overloaded constructor with the following value:
    //  A String with a parameter value of interiorFeature
    public InteriorFeature(String interiorFeature){
        //Set the interiorFeature instance variable to the parameter interiorFeature
        this.interiorFeature = interiorFeature;
    }

    //A public method named getFeature that doesn't have a formal parameter and that returns an instance of String.
    @Override
    public String getFeature() {
        return interiorFeature;
    }

    //A public method setFeature that takes a String parameter interiorFeature and that returns a void. It should
    //  set the instance variable interiorFeature.
    @Override
    public void setFeature(String feature) {
        this.interiorFeature = feature;
    }

    //A public toString method that returns the following:
    //      Interior [Generic]
    public String toString(){
        return "Interior [" + interiorFeature + "]";
    }

}
