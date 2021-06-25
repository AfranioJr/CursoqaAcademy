programa
{
	funcao inicio ()
	{
		inteiro num, fat, i=1

        escreva("Digite um valor Numérico: ")
		leia(num)
		
		se(num==0){
			num=1
		}
		
		fat = num
		
		enquanto(i<num){
			fat = fat *(num-i)
			i++
		}
		
		escreva("O fatorial de: " +num+" é: " +fat)
		
	}
}
