package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class SammysRentalPrice {
    final static int COST_HOUR =40;
   public SammysRentalPrice(int minutes){
       int hour = minutes/60;
       int min = minutes%60;
       System.out.println("Costo Total: $"+(hour*COST_HOUR+min));
   } 
}
