package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class ProjectedSales {
    final static float ANTICIPATED_INCREASE = 0.10f;
    final static int SALES_NORTH = 5000;
    final static int SALES_SOUTH = 4500;

    public ProjectedSales() {
        System.out.println("Las ventas del Norte fueron de $"+SALES_NORTH+", se espera el proximo año un aunmento de $"+SALES_NORTH*(1+ANTICIPATED_INCREASE));
        System.out.println("Las ventas del Norte fueron de $"+SALES_SOUTH+", se espera el proximo año un aunmento de $"+SALES_SOUTH*(1+ANTICIPATED_INCREASE));
    }
    
    
    
}
