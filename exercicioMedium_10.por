programa {
	funcao inicio() {
		inteiro elemento=0, i=2, vetFibonacci[20]
		
		escreva("Digite um valor: ")
		leia(elemento)
		
	
		vetFibonacci[0]=0
		vetFibonacci[1]=1
		
		enquanto(i<elemento){
		    vetFibonacci[i] = vetFibonacci[i-2]+vetFibonacci[i-1]
		    i++
		}
		i=0
		enquanto(i<elemento){
		    escreva(vetFibonacci[i]+" -")
		    i++
		}
	}
}
