package exercicios_medium;

public class Exercicio06_Medium {

    public int fatorialNumero(int numero){
        int fatorial, i=1;

        if(numero == 0){
            numero = 1;
        }
        fatorial = numero;

        while(i < numero){
            fatorial = fatorial*(numero-i);
            i++;
        }
        return fatorial;
    }
    
}
