package exercicios_medium;

import javax.swing.JOptionPane;

/*
2-) Faça um algoritmo para ler um valor de investimento,
com uma taxa de juros de 5% a.a. Ao final de 10 anos,
exibir o valor investido, valor dos juros, e o total.
Considerando que a remuneração será no regime de juros
compostos.

Inicio Algoritmo
    Declarar variável do numerico: valorInvestido,
    valorAtualizado, juros=0,05, ano=1;
    valorInvestido = Ler valor digitado;
    valorAtualizado= valorInvestido;
    
    Enquanto(ano <=10){//Inicio enquanto
        valorAtualizado= valorAtualizado + valorInvestido* juros;
        ano++; //ano=ano+1;
    }//Fim enquanto
    
    Exibir(“O Valor investido foi: ”+ valorInvestido);
    Exibir(“O Valor dos juros foi: ”+ valorAtualizadovalorInvestido);
    Exibir(“O Valor totalserá: ”+ valorAtualizado);
Fim algoritmo
*/
public class Exercicio02_Medium {
    public static void main(String[] args) {
        double valorInvestido, valorAtualizado, juros=0.05, ano=1;

        valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido: "));
        valorAtualizado = valorInvestido;

        while(ano <= 10){
            valorAtualizado = valorAtualizado + valorInvestido * juros;
            ano++;
        }

        System.out.println("O valor investido foi: "+valorInvestido);
        System.out.println("O valor dos juros foi: "+(valorAtualizado - valorInvestido));
        System.out.println("O valor total será: "+valorAtualizado);
    }
    
}
