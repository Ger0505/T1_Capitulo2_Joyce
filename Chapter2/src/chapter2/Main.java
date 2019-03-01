package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //a
        MilesToFeet milesToFeet = new MilesToFeet();
        MilesToFeetInteractive milesToFeetInteractive = new MilesToFeetInteractive();
        //b)
        ProjectedSales projectedSales = new ProjectedSales();
        ProjectedSalesInteractive projectedSalesInteractive = new ProjectedSalesInteractive();
        //c
        InchesToFeet inchesToFeet = new InchesToFeet();
        InchesToFeetInteractive inchesToFeetInteractive = new InchesToFeetInteractive();
        //d
        Initials initials = new Initials();
        //e
        Eggs eggs = new Eggs(27);
        //f
        DogBoarding dogBoarding = new DogBoarding(10,3);
        //g
        Dollars dollars = new Dollars(2);
        //h
        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius(124);
        //i
        TicketNumber ticketNumber = new TicketNumber(154123);
        //CASE PROBLEMS
        //1.
        CarlysEventPrice carlysEventPrice = new CarlysEventPrice(100);
        //2.
        SammysRentalPrice sammysRentalPrice = new SammysRentalPrice(176);
    }
    
}
