/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9ej6;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Traballador {

    private float soldo;
 
    public static Traballador[] crearTraballadores() {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Número traballadores:"));
        Traballador[] array = new Traballador[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Traballador();
            array[i].soldo = Float.parseFloat(JOptionPane.showInputDialog("Introduce o soldo" + i + ":"));
        }
        return array;
    }

    public static void calcularSoldos(Traballador[] array) {
        int count = 0;
        int count2 = 0;
        for (Traballador array1 : array) {
            if (array1.soldo <= 1750 && array1.soldo >= 1000) {
                count++;
            } else if (array1.soldo < 1000) {
                count2++;
            } else {

            }
        }
        JOptionPane.showMessageDialog(null, "Hai " + count + " traballadores con un soldo de entre 1000€ e 1750€");
        JOptionPane.showMessageDialog(null, "A porcentaxe de traballadores cun soldo inferior a 1000€ é " + count2 * 100 / array.length + "%");

    }
}
