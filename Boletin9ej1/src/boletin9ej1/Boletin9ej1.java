/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9ej1;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin9ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " + i));
            if(n<0)
                JOptionPane.showMessageDialog(null,"Negativo");
            else if(n>0)
                JOptionPane.showMessageDialog(null,"Positivo");
            else
                JOptionPane.showMessageDialog(null,"Igual a 0");
            i++;
        }
    }
    
}
