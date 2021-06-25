package exercicios_easy;

import javax.swing.JOptionPane;

public class Desafio01_Jogo_da_Forca {
    public static void main(String[] args) {
        String t="_", e="_", s="_", palavraAdivinhada, texto;
        int i = 0, acertos=0;
        System.out.println(">__________________________________________________________<\n"+
                            "\n[ JOGO DA FORCA ] " +
                            "\n Adivinhe a palavra secreta abaixo: ");
        while(i<6){
            System.out.println("\n" + t +" "+ e +" "+ s +" "+ t+" "+ e +" "+ s + " ");
            
            if((t!="_") && (e!="_") && (s!="_")){
                i = 7;

                JOptionPane.showConfirmDialog(null, "Parabéns você acertou a Palavra secreta era:\n [TESTES]","🎉🎊 Beleza Campeão 🎊🎉", JOptionPane.DEFAULT_OPTION);
            }else{//INICIO - Ler valor digitado pelo Usuário
                palavraAdivinhada = JOptionPane.showInputDialog("Digite uma letra para adivinhar: " + "\nEssa é a tentativa número ["+(i+1)+"] de : "+"[6]");
                switch(palavraAdivinhada){//INICIO - Testa se acertou alguma letra.
                    case "t":
                        t = palavraAdivinhada;
                        break;
                    case "e":
                        e = palavraAdivinhada;
                        break;
                    case "s":
                        s = palavraAdivinhada;
                        break;
                }//FIM - Testa se acertou algunma letra.
                
                i++;      
            }//FIM - Ler valor digitado pelo Usuário
        }
        if (i==6){//INICIO - Testar quantidade de acertos do usuário
            if(t!="_"){
                acertos = acertos +1;
            }
            if(e!="_"){
                acertos = acertos +1;
            }
            if(s!="_"){
                acertos = acertos +1;
            }//FIM - Testar quantidade de acertos do usuário
 
            if(acertos>1){//INICIO - Plurarizar o texto Palavra.
                texto= "palavras";
            }else{
                texto= "palavra";
            }//FIM - Plurarizar o texto Palavra.
            JOptionPane.showConfirmDialog(null, "Poxa que pena você acertou apenas :\n "+acertos+" "+texto,"😭😭 Não foi dessa vez Chapa 😭😭", JOptionPane.DEFAULT_OPTION);
        }
    }
}
