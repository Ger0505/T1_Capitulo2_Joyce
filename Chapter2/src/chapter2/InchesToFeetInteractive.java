/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo A A
 */
public class InchesToFeetInteractive {

    public InchesToFeetInteractive() {
        int inches = Integer.parseInt(JOptionPane.showInputDialog("No. de pulgadas"));
        JOptionPane.showMessageDialog(null,inches+" pulgadas es igual a "+(int)(inches/12)+" pies y "+(int)(inches%12)+ " pulgadas");
    }
    
}
