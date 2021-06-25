package exercicios_medium;

public class Exercicio10_Medium {
    public int calcularTermoSequenciaFibonacci(int termo){
        int i = 2;
        int [] vetFibonacci = new int [termo];
        vetFibonacci[0] = 0;
        vetFibonacci[1] = 1;

        while( i < termo) {
            vetFibonacci[i] = vetFibonacci[i-2] + vetFibonacci[i-1];
            i++;
        }

        return vetFibonacci[termo-1];
    }
    
}
