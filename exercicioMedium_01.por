/*  Exercicio 01 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
*   numeros Pares e Impares.
*/
programa {
	funcao inicio() {
		inteiro i=0
		
		enquanto(i<=100){
		    se(i%2==0){
		        escreva("O número "+i+" é Par\n")
		    }senao{
		        escreva("O número "+i+" é Impar\n")
		    }
		    i++
		}
	}
}