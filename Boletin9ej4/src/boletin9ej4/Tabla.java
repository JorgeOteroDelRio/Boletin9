/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9ej4;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Tabla {
    
    public static void pedirNumero(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        if(n!=0){
            for(int i = 1;i<=10;i++){
            JOptionPane.showMessageDialog(null,n + "*" + i + "=" + n*i);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Ha salido del programa");
    }
    
}
    
    

