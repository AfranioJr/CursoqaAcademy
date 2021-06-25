package exercicios_medium;
/*
1-) Faça um algoritmo para verificar e exibir de 0 a 100,
quais são os números Pares e ímpares.
Inicio Algoritmo
    Declarar variável do inteiro: i=0;
    Enquanto(i<=100){//iniciando enquanto
    SE(i%2==0){
        Exibir(“O numero ”+i+” é par”)
    }//fim se
    SE Não{
        Exibir(“O numero ”+i+” é impar”)
    }//Fim senão
    i++; // i=i+1
    }fim Enquanto
Fim Algoritmo
*/
public class Exercicio01_Medium {
    /* public static void main(String[] args) {
        int i =0;
        while(i<=100){
            if(i%2==0){
                System.out.println("O Número "+i+" é PAR!");
            }else{
                System.out.println("O Número "+i+" é IMPAR!");
            }
            i++;
        }
    } */
    public String verificaParImpar(int numero){
        if(numero % 2 == 0){
            return "O numero " + (numero) + " é par";
        }// fim se
            else {
                return "O numero " + (numero) + " é impar";
            }//fim
    }
}
