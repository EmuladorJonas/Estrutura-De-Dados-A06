package com.mycompany.pilhas;
import javax.swing.JOptionPane;

/* @author EmuladorJonas */
 /* "Sucessos... Savem o Criador!!!" */
public class Pilhas {

    public static void main(String[] args) {

        String texto; //Texto para inverter
        String TextoI = ""; //Texto invertido
        char[] p = new char[100]; //valores da pilha, no caso as letres "char"
        int topo; //Topo da Pilha
        int i, j;
        char pa;

        Pilha pilha = new Pilha();
        topo = pilha.topopilha;
         
        texto = JOptionPane.showInputDialog("Qual texto quer inverter?");
        for(i=0; i<texto.length(); i++)
        {
            p[i] = texto.charAt(i);
        }
        
        for(j=0; j<texto.length(); j++)
        {
            if(p[j] != ' ')
            {
                topo = pilha.push(topo, p[j]);
            }
            else
            {
                TextoI = TextoI + " ";
                while(pilha.tamanho() != 0)
                {
                    pa = pilha.pop(topo);
                    TextoI = TextoI + pa;
                    topo--;
                }
            }
        }
        
        if(pilha.tamanho() != 0)
        {
            TextoI = TextoI + " ";
            while(pilha.tamanho() != 0)
            {
                pa = pilha.pop(topo);
                TextoI = TextoI + pa;
                topo--;
            }
        }
        
        System.out.println(TextoI);
        
    }

}
