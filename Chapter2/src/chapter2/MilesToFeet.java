package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class MilesToFeet {
    static final int FEET_IN_MILE=5280;
    static final float MILLES_UNCLE_HOUSE = 8.5f;

    public MilesToFeet() {
         System.out.println("The distance to my uncle's house is "+MILLES_UNCLE_HOUSE+" miles or "+
        (float)(MILLES_UNCLE_HOUSE*FEET_IN_MILE)+" feet");
    }
    
    
}
