package exercicios_easy;

import javax.swing.JOptionPane;

/*
9-)Faça um algoritmo para ler um número inteiro entre:
1 e 10, calcular e exibir a tabuada deste número digitado.
Ex.: 10 x 1 = 10, .., 10 x 10 = 100.

Inicio Algoritmo
    Declarar variável do inteiro: i=1, numero;
    numero = Ler numero digitado;

    Enquanto(i<=10) { //inicio enquanto
        Exibir (numero*i);
        i++ / i=i+1
    } //fim enquanto
Fim Algoritmo
*/

public class Exercicio09_Easy {
 public static void main(String[] args) {
     Integer i=0, numero;

     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para realizar a Tabuada: "));

     while(i<=10){//init of while
         System.out.println(numero + " x " + i + " = " + (numero*i++));
     }//end of while
 }   
}
