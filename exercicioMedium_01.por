/*  Exercicio 01 - Fa�a um algoritmo para verificar e exibir de 0 a 100, quais s�o os
*   numeros Pares e Impares.
*/
programa {
	funcao inicio() {
		inteiro i=0
		
		enquanto(i<=100){
		    se(i%2==0){
		        escreva("O n�mero "+i+" � Par\n")
		    }senao{
		        escreva("O n�mero "+i+" � Impar\n")
		    }
		    i++
		}
	}
}