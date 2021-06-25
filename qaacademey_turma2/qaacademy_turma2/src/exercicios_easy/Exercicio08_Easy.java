package exercicios_easy;

import javax.swing.JOptionPane;

/* 
Iniciar Algoritmo
    Declarar variável do tipo Numerico: salario,
    imposto=0;
    salario = Ler salario digitado;
    
    SE(salario >= 1.903,99 && salario <= 2.826,65){
        imposto=(salario*0,075)-142,80;
    }
    SE(salario >= 2.826,66 && salario <= até 3.751,05){
        imposto=(salario*0,15)-354,80;
    }
    SE(salario >= 3.751,06 && salario <= 4.664,68){
        imposto=(salario*0,225)- 636,13;
    }
    SE(salario > 4.664,68){
        imposto=(salario*0,275)- 869,36;
    }
    
    Exibir (“O seu salario bruto: ”+4664,69);
    Exibir (“O seu salario liquido: ”+(4251,26));
    Exibir (“Valor do imposto renda: ”+413,43);
Fim Algoritmo
*/
public class Exercicio08_Easy {
    public static void main(String[] args) {
        double salario, valorINSS;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));

        if((salario >= 1903.99) && (salario <= 286.65)){
            valorINSS = (salario*0.075)-142.80;
        }else if((salario >= 2826.66) && (salario <= 3751.05)){
            valorINSS = (salario*0.09)-354.80;
        }else if((salario >= 3751.06) && (salario <= 4664.68)){
            valorINSS = salario*0.12;
        }else if(salario > 4664.69){
            valorINSS = salario*0.14;
        }else{
            valorINSS = 0;
        }

        System.out.println("O seu salário bruto: "+salario);
        System.out.println("O seu salário liquido: "+(salario-valorINSS));
        System.out.println("O valor a pagar de INSS será: "+valorINSS);
    }
    
}
