package chapter2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo A A
 */
public class ProjectedSalesInteractive {
    final static float ANTICIPATED_INCREASE = 0.10f;

    public ProjectedSalesInteractive() {
        int sales_north = Integer.parseInt(JOptionPane.showInputDialog("Ventas del North:"));
        int sales_south = Integer.parseInt(JOptionPane.showInputDialog("Ventas del South:"));
        JOptionPane.showMessageDialog(null,"Las ventas del Norte fueron de $"+sales_north+", se espera el proximo año un aunmento de $"+sales_north*(1+ANTICIPATED_INCREASE));
        JOptionPane.showMessageDialog(null,"Las ventas del Norte fueron de $"+sales_south+", se espera el proximo año un aunmento de $"+sales_south*(1+ANTICIPATED_INCREASE));

    }
    
    
}
