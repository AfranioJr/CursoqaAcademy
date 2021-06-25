package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercicios_medium.Exercicio09_Medium;

public class TesteExercicio09_medium {
    @Test
    public void testeNomeAluno(){
        Exercicio09_Medium exe09 = new Exercicio09_Medium();
        assertEquals("Nome do Aluno: Micheline Numero: 1", exe09.alunoMatricula(0));
    }
}
