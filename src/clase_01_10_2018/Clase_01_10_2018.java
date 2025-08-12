/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_01_10_2018;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * * @author cristian
 */
public class Clase_01_10_2018 {

    public static void main(String[] args) {
        int num[][] = new int[2][2];
        num[0][0] = 1;
        num[0][1] = 2;
        num[1][0] = 3;
        num[1][1] = 4;

        int num2[][] = new int[2][2];
        num2[0][0] = 1;
        num2[0][1] = 2;
        num2[1][0] = 3;
        num2[1][1] = 4;

        int Resultado[][] = new int[2][2];
        Resultado[0][0] = num[0][0] + num2[0][0];
        Resultado[0][1] = num[0][1] + num2[0][1];
        Resultado[1][0] = num[1][0] + num2[1][0];
        Resultado[1][1] = num[1][1] + num2[1][1];
        JOptionPane.showMessageDialog(null, "Matriz resultado" + "\n" + "Resultado[0][0]: " + Resultado[0][0] + "\n " + "Resultado[0][1]:" + Resultado[0][1] + "\n" + "Resultado[1][0]: " + Resultado[1][0] + "\n " + "Resultado[1][1]: " + Resultado[1][1]);

    }
}
