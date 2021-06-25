programa {
	funcao inicio() {
		inteiro multiplicacao = 1, i = 1
		
		enquanto(i<1000){
		    multiplicacao = multiplicacao * i
		    
		    se(multiplicacao >= 1000){
		        multiplicacao = 1
		    }
		    i++
		}
		escreva("O total da multiplicação é: "+multiplicacao)
	}
}