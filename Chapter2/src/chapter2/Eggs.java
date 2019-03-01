package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class Eggs {
    final static float DOZEN = 3.25f;
    final static float INDIVIDUAL = .45f;

    public Eggs(int eggs){
        int dozen = eggs/12;
        int individual = eggs%12;
        System.out.println("You ordered "+ eggs +" eggs. Thats "+dozen+" dozen at $"+DOZEN+" per dozen and "+individual+" loose eggs at $"+INDIVIDUAL+" cents each for a total of $"+(dozen*DOZEN+individual*INDIVIDUAL));
    }
    
    
}
