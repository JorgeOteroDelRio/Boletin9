/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9ej5;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin9ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanho;
        String serie="";
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de elementos:"));
        //Serie A
        for(int i=0;i<tamanho*2;i+=2){
            serie+=i + " + ";
        }
        JOptionPane.showMessageDialog(null,serie);
        
        //Serie B
        serie="";
        for(int i=1;i<=tamanho;i++){
            if(i%2!=0)
                serie+="-"+i;
            else
                serie+="+"+i;
        }
        JOptionPane.showMessageDialog(null,serie);
        
        //Serie C
        serie="";
        int x=1,y=1;
        serie+=x + ",";
        for(int i=2;i<=tamanho;i++){
            serie+=y + ",";
            y=x+y;
            x=y-x;
        }
        JOptionPane.showMessageDialog(null,serie);
        
    }
    
}
