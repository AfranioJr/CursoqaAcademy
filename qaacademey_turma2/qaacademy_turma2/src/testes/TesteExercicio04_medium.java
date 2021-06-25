package testes;

import org.junit.Test;

import exercicios_medium.Exercicio04_Medium;

public class TesteExercicio04_medium {
    @Test
    public void testeMultiplicacoAteMil(){
        Exercicio04_Medium exe4 = new Exercicio04_Medium();
        System.out.println(exe4.calcularMultiplicacaoNumeroInteiro());
    }
}
