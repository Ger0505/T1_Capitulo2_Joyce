package chapter2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo A A
 */
public class MilesToFeetInteractive extends MilesToFeet {

    public MilesToFeetInteractive() {
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Distancia de la casa del tio"));
        JOptionPane.showMessageDialog(null,"The distance to my uncle's house is "+distancia+" miles or "+(float)(distancia*FEET_IN_MILE)+" feet");
       
    }
    
}
