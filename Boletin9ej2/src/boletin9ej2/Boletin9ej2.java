/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9ej2;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin9ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int countSuma= 0;
        double countMulti = 1;
        for(int i=10;i<=90;i++){
            countSuma+=i;
            countMulti*=i;
        }
        JOptionPane.showMessageDialog(null,"La suma es " + countSuma);
        JOptionPane.showMessageDialog(null,"El producto es " + countMulti);
    }
    
}
