/*6. Leia um vetor de 10 posições. Contar e escrever quantos
valores pares ele possui.*/
package com.mycompany.exercise006;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Exercise006 {
    public static void main(String[] args) {
        int valor [] = new int[10];
        int p;
        ArrayList<Integer> valoresPar = new ArrayList<Integer>();        
        int qtdValorPar = 0;
        for (int c = 0; c <= valor.length-1; c++) {
            p = c+1;
            valor [c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + p + "º valor: "));       
            if (valor[c] % 2 == 0) {
                qtdValorPar++;
                valoresPar.add(valor[c]);
            }
        }
        if (qtdValorPar == 0) {
            JOptionPane.showMessageDialog(null, "Não há valores pares!");
        } else {
            JOptionPane.showMessageDialog(null, "No total, existem " + qtdValorPar + " valores pares."
                    + "\nE esses são: \n" + valoresPar);
        }
    }
}
