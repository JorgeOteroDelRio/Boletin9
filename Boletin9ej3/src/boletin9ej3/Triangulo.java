/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9ej3;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Triangulo {
    
    private float base,altura;
    
    public void setBaseAltura(){
        do{
            base = Float.parseFloat(JOptionPane.showInputDialog("Introduzca base"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca altura"));  
        }while(base<0 || altura<0);
    }   
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area es " + base*altura/2);
    }
    
    
}
