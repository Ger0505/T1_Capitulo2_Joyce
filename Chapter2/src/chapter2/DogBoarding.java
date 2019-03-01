package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class DogBoarding {
    
    final static float CENTS_PER_DAY = 0.5f;
    
    public DogBoarding(float weight,int days) {
            System.out.println("Price for Boarding: $"+(weight*CENTS_PER_DAY*days));
    }
    
}
