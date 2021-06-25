package exercicios_easy;

import javax.swing.JOptionPane;

/*
*    Exercício 03 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, troccados.
*
*    Inicio do Algoritmo
*        Declarar variavel do tipoo texto: primeiraPalavra, segundaPalavra;
*        primeiraPalavra = ler palavra digitada;
*        segundaPalavra = ler palavra digitada;
*        exibir palavra digitada segundaPalavra;
*        exibir palavra digitada primeiraPalavra;
*    Fim do Algoritmo
*/
public class Exercicio03_Easy {
    public static void main(String[] args) {
        String primeiraPalavra, segundaPalavra;
        primeiraPalavra = JOptionPane.showInputDialog("Informe a Primeira Palavra");
        segundaPalavra = JOptionPane.showInputDialog("Informe a Segunda Palavra");

        System.out.println("A Primeira palavra digitada foi: " +segundaPalavra+ "\nA Segunda Palavra digitada foi: " +primeiraPalavra);
    }
    
}
