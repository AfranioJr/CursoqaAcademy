package exercicios_easy;

import javax.swing.JOptionPane;

/*
4-) Faça um algoritmo para ler um número inteiro,
armazenar em uma variável, calcular o dobro, e exibir.

Inicio do Algoritmo
    Declarar variável do tipo Numerico numeroDigitado, resultado;
    numeroDigitado = Ler 10;
    resultado = numeroDigitado *2;
    Exibir resultado;
Fim Algoritmo
*/

public class Exercicio04_Easy {
    public static void main(String[] args) {
        int numero, dobro;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
        dobro = 2*numero;

        System.out.println("O Dobro de " +numero+ " é: " +dobro);
    }
    
}
