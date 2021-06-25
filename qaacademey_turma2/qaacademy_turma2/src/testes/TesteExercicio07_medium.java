package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercicios_medium.Exercicios07_Medium;

public class TesteExercicio07_medium {
    
    @Test
    public void testeRetornaMes(){
        Exercicios07_Medium exe07 = new Exercicios07_Medium();
        System.out.println(exe07.mesDoAno(0));

        assertEquals("Janeiro", exe07.mesDoAno(0));
    }
}
