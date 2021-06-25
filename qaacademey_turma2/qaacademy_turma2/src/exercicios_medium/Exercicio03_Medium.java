package exercicios_medium;

/*
3 -) Faça um algoritmo para calcular e exibir a soma de
todos os números de 0 a 1000. E parar se caso a soma
atingir 1500(Ou mais).

Inicio Algoritmo
    Declarar variável do tipo inteiro: soma, i=0;
    
    Enquanto(i<=1000){//inicio enquanto
        soma = soma + i;
        
        SE(soma>=1500){
            parar enquanto; //break
        }
        i++//i=i+1
    }//fim enquanto
    
    Exibir (soma);

Fim Algoritmo
*/

public class Exercicio03_Medium {
    public static void main(String[] args) {
        int soma=0, i=0;

        while(i<=1000){
            soma = soma +i;

            if(soma >= 1500){
                break;
            }
            i++;
        }
        System.out.println("A soma dos numeros é" +soma);
    }
    
}
