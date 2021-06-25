package exercicios_easy;

import javax.swing.JOptionPane;

/*
10-) Faça um algoritmo para ler um valor de investimento,
com uma taxa de juros de 5% a.a. Ao final de 10 anos,
exibir o valor investido, valor dos juros e o total com
juros. Considerando que a remuneração será no regime de
juros simples.

Inicio Algoritmo
    Declarar variáveis do Numerico : ano=1, juros,
    valorInvestido;
    valorInvestido = Ler numero digitado;
    
    Enquanto(ano<=10){
        Juros = juros+valorInvestido*0,05;
        ano ++; //ano = ano +1
    }

    Exibir(“Valor investido: “ + valorInvestido)
    Exibir(“Valor dos juros: “ + juros)
    Exibir (“Total com juros: “ + (valorInvestido+juros));
Fim Algoritmo
*/

public class Exercicio10_Easy {
 public static void main(String[] args) {
     double juros=0.05, valorInvestido;

     valorInvestido = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser investido: "));

     System.out.println("Valor investido será: " + valorInvestido +
                    "\nValor dos juros: " + juros +
                    "\nTotal com juros: " + (valorInvestido + juros));
 }   
}
