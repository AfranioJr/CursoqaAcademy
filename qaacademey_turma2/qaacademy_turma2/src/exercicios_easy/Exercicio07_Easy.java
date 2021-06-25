package exercicios_easy;

import javax.swing.JOptionPane;

/* 
// Inicio Algoritmo
//     Declarar variavel do tipo Numerico salario;
//     salario = Ler 5.000,00;
//     SE salario <= 1.045,00 {
//         Exibir salario * 0,075; //7,5%
//     } Se salario >= 1.045.01 && salario <= 2.089,60{
//         Exibir salario * 0,09; //9%
//     } SE salario >= 2.089,61 && salario <= 3.134,40{
//         Exibir salario * 0,12; //12%
//     } SE salario >= 3.134,41 && salario <= 6.101.06{
//         Exibir salario * 0,14; //14%
//     }
// Fim Algoritmo
*/
public class Exercicio07_Easy {
    public static void main(String[] args) {
        double salario, valorINSS;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));

        if(salario <= 1045.00){
            valorINSS = salario*0.075;
        }else if(salario >= 1045.01 && salario <= 2089.60){
            valorINSS = salario*0.09;
        }else if(salario >= 2089.61 && salario <= 3134.40){
            valorINSS = salario*0.12;
        }else if(salario>= 3134.41 && salario <= 6101.06){
            valorINSS = salario*0.14;
        }else{
            salario = 6101.06;
            valorINSS = salario*0.14;
        }

        System.out.println("O valor a pagar de INSS será: "+valorINSS);
    }
    
}
