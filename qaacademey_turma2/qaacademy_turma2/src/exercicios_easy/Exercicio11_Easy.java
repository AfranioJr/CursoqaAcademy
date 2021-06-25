package exercicios_easy;

import javax.swing.JOptionPane;

/*
11-) Faça um algoritmo para ler um número inteiro, somar
2 ao número digitado, até completar 100 iterações. Por ex.:
Digitou 10. 10+2, 12+2, 14+2, Até completar 100
iterações.

Inicio Algoritmo
    Declarar variável do inteiro: i=1, numero;
    numero = Ler numero digitado;
    Enquanto(i<=100) { //inicio enquanto
        numero=numero+2;
        Exibir (numero);
        i++ / i=i+1
    } //fim enquanto
Fim Algoritmo
*/

public class Exercicio11_Easy {
    public static void main(String[] args) {
        int i =1, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        while(i <= 100){
            numero = numero+2;
            System.out.println(numero);
            i++;
        }
    }
    
}
