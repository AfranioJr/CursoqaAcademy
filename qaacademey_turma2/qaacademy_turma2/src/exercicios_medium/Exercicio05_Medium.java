package exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio05_Medium {

    public int verficaMenorNumero(){
        int numeroDigitado, menorDigitado=0, i=1;
        while(i<=5){
            numeroDigitado = Integer.parseInt(JOptionPane.
                    showInputDialog("Digite um número: "));

            if(numeroDigitado < menorDigitado || i == 1){
                menorDigitado = numeroDigitado;
            }
            i++;
        }
        return menorDigitado;
    }
    
}
