package exercicios_easy;

import javax.swing.JOptionPane;
/*
5-) Faça um algoritmo para ler três números inteiros,
armazenar em variáveis, e exibir a soma, a subtração,
multiplicação e a média dos três números digitados.
// Inicio Algoritmo
//
//     Declarar variável do tipo Inteiro primeiro, segundo,terceiro;
//    
//     primeiro = Ler 10;
//     segundo = Ler 15;
//     terceiro = Ler 100000;
//    
//     Exibir “Valor da Soma = ” + (primeiro + segundo + terceiro);
//     Exibir “Valor da Subtração = ” + (primeiro - segundo - terceiro);
//     Exibir “Valor da Multiplicação = ” + (primeiro *  segundo * terceiro);
//     Exibir “Valor da Média = ” + (primeiro + segundo + terceiro)/3;
// Fim Algoritmo
*/
public class Exercicio05_Easy {
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, terceiroNumero;

        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número: "));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número: "));
        terceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro Número: "));

        System.out.println("A soma de "+primeiroNumero+
                                        " + "+segundoNumero+
                                        " + "+terceiroNumero+
                                        " é igual a: " +(primeiroNumero+segundoNumero+terceiroNumero));

        System.out.println("A subtração de "+primeiroNumero+
                                        " - "+segundoNumero+
                                        " - "+terceiroNumero+
                                        " é igual a: " +(primeiroNumero-segundoNumero-terceiroNumero));

        System.out.println("A Multiplicação de "+primeiroNumero+
                                        " x "+segundoNumero+
                                        " x "+terceiroNumero+
                                        " é igual a: " +(primeiroNumero*segundoNumero*terceiroNumero));

        System.out.println("A Média de "+primeiroNumero+
                                        " e "+segundoNumero+
                                        " e "+terceiroNumero+
                                        " é: " +((primeiroNumero+segundoNumero+terceiroNumero)/3));
    }
    
}
