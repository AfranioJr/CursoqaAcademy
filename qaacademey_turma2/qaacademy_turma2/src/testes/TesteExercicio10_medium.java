package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercicios_medium.*;

public class TesteExercicio10_medium {
    //Exercicio 01
    @Test
    public void testaParOuImpar(){
        Exercicio01_Medium ex1 = new Exercicio01_Medium();
        assertEquals("O numero "+ 0 + " é par", ex1.verificaParImpar(0));
        assertEquals("O numero "+ 1 + " é impar", ex1.verificaParImpar(1));
    }
    //Exercicio 04
    @Test
    public void testeMultiplicacoAteMil(){
        Exercicio04_Medium exe4 = new Exercicio04_Medium();
        assertEquals(1, exe4.calcularMultiplicacaoNumeroInteiro());
        System.out.println(exe4.calcularMultiplicacaoNumeroInteiro());
    }

    //Exercicio 10
    @Test
    public void calculaTermoFibonacci(){
        Exercicio10_Medium exe10 = new Exercicio10_Medium();
        assertEquals(34, exe10.calcularTermoSequenciaFibonacci(10));
    }
}
