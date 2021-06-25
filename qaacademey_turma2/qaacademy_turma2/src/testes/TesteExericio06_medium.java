package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercicios_medium.Exercicio06_Medium;

public class TesteExericio06_medium {
    @Test
    public void testFatorialNumero(){
        Exercicio06_Medium exe06 = new Exercicio06_Medium();
        assertEquals(3628800, exe06.fatorialNumero(10));
    }
}
