package exercicios_medium;

public class Exercicio09_Medium {
    public String alunoMatricula(int pos){
        String  [] nomeDoAluno = new String [5];
        int     [] numeroAluno = new int [5];

        nomeDoAluno[0] = "Micheline";
		numeroAluno[0] = 1; 
		
		nomeDoAluno[1] = "Luiz Claudio";
		numeroAluno[1] = 2; 
		
		nomeDoAluno[2] = "Misrael";
		numeroAluno[2] = 3;
		
		nomeDoAluno[3] = "Ana Paula";
		numeroAluno[3] = 4;
		
		nomeDoAluno[4] = "Júnior";
		numeroAluno[4] = 5;

		String resultado = "Nome do Aluno: "+nomeDoAluno[pos] +" Numero: "
				+numeroAluno[pos];

        return resultado;
    }
}
