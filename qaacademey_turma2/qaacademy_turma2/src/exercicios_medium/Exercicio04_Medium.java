package exercicios_medium;

public class Exercicio04_Medium {
    public int calcularMultiplicacaoNumeroInteiro(){
        int resultadoMultiplicacao=1, i=1;

        while(i <= 1000){
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            if(resultadoMultiplicacao >= 1000){
                resultadoMultiplicacao = 1;
            }
            i++;
        }
        return resultadoMultiplicacao;
    }    
}
