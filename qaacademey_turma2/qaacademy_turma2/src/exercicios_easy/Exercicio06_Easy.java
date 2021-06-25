package exercicios_easy;

import javax.swing.JOptionPane;
/*
// Inicio Algoritmo
//
//     Declarar variável do tipo Inteiro nota1, nota2;
//     Declarar variável do tipo texto resultado;
//    
//     primeiro = Ler primeira nota 10;
//     segundo = Ler segunda nota 5;
//     Se(nota1+nota2/2>5){
        resultado = "Parabéns você foi aprovado!;
        }Senão(nota1+nota2){
            resultado="Poxa que pena, você"
        }
//    
//     Exibir “Valor da Soma = ” + (primeiro + segundo + terceiro);
//     Exibir “Valor da Subtração = ” + (primeiro - segundo - terceiro);
//     Exibir “Valor da Multiplicação = ” + (primeiro *  segundo * terceiro);
//     Exibir “Valor da Média = ” + (primeiro + segundo + terceiro)/3;
// Fim Algoritmo
*/
public class Exercicio06_Easy {
    public static void main(String[] args) {
        int nota1, nota2;
        String resultado;

        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Primeira nota: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Segunda nota: "));

        if((nota1+nota2)/2 > 5){
            resultado = "Parabéns você foi Aprovado!";
        }else if((nota1+nota2)/2 < 5){
            resultado = "Poxa que pena, você foi Reporvado!";
        }else{
            resultado = "Xiii... Você ficou de exame!";
        }

        System.out.println(resultado);
    }
    
}
