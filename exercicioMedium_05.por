programa
{
	funcao inicio ()
	{
		inteiro numero=0, i=0, menor=0
		
		enquanto(i<=4){
			escreva("Digite um numero: ")
			leia(numero)
			
			se(numero < menor ou i==0){
				menor = numero
			}
			i++
		}
		
		escreva("O menor valor digitado é: " + menor)
	}
}
