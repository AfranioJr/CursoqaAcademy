package testes;
import org.junit.Assert;
import org.junit.Test;

import exercicios_medium.Exercicio01_Medium;


public class TesteExercicio01_medium {
    
    @Test
    public void testaParOuImpar(){
        Exercicio01_Medium ex1 = new Exercicio01_Medium();
        Assert.assertEquals("O numero "+ 0 + " é par", ex1.verificaParImpar(0));
        Assert.assertEquals("O numero "+ 1 + " é impar", ex1.verificaParImpar(1));
    }
}
