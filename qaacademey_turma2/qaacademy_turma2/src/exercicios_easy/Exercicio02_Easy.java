package exercicios_easy;

import javax.swing.JOptionPane;
/*
*    Exercício 02 - Faça um algoritmo para ler e exibir uma palavra.
*
*    Inicio do Algoritmo
*        Declarar variavel do tipoo texto: palavraDigitada;
*        palavraDigitada = ler palavra digitada;
*        exibir palavra digitada palavraDigitada;
*    Fim do Algoritmo
*/
public class Exercicio02_Easy {
    public static void main(String[] args) {
        String palavra;
        palavra = JOptionPane.showInputDialog("Digite uma Palavra");
        System.out.println(palavra);
    }
    
}
