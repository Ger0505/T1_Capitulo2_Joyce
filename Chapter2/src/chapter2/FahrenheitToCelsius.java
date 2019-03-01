
package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class FahrenheitToCelsius {

    public FahrenheitToCelsius(int degrees) {
        Double d = ((degrees-32.0)*5.0)/9;
        System.out.println("Fahrenheit: "+degrees);
        System.out.println("Celsius   : "+d);
    }
    
    
}
