/*  Exercicio 02 - Fa�a um algoritmo para ler um valor de investimento, com uma taxa
*   de juros de 5%a.a.Ao final de 10 anos, exibir o valor investido, o valor dos juros, e
*   o total. Considerando que a remunera��o ser� no regime de juros compostos.
*/
programa {
	funcao inicio() {
		inteiro ano=1
		real valorInvestido, valorAtualizado, juros=0.05
		
		escreva("Digite o valor que ser� Investido: ")
		leia(valorInvestido)
		valorAtualizado = valorInvestido
		
		enquanto(ano<=10){
		    valorAtualizado = valorAtualizado + valorInvestido*juros
		    ano++
		}
		escreva("O valor Investido foi: "+valorInvestido)
		escreva("O valor dos Juros foi: "+(valorAtualizado-valorInvestido))
		escreva("O valor Total ser�: "+valorAtualizado)
		
	}
}