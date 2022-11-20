package com.mycompany.pilhas;
import javax.swing.JOptionPane;

/**
 *
 * @author JONAS
 */
public class Pilha {
  
    char pilha[] = new char[200]; // Tamanho da Pilha
    int topopilha = -1; // indica onde está o topo da pilha. "-1" indica que ela está vazia!!!
    
    // Método para ezvaziar pilha    
    void ezvazia_pilha()
    {
        this.topopilha  = -1;
    }
    
    // Método para retornar o tamanho da pilha
    int tamanho()
    {
        return(this.topopilha +1); // o +1 eh pq em java consideramos o 0 como uma unidade NUNCA ESQUEÇA DISSO!!!
    }
    
    // Método para imprimir o conteúdo da pilha
    void imprimir(int topo)
    {
        for(int i=topo; i>0; i--)
        {
            System.out.println("Valor na pilha: " +this.pilha);
        }
    }
    
    // Método para inserir valores na pilha
    int push(int topo, char p)
    {
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha<0)
        {
            this.topopilha = 0;
        }
       
        if(this.topopilha > 199)
        {
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }
        else
        {
            this.pilha[this.topopilha] = p;
            System.out.println("Inserindo..: "+p);
            return(this.topopilha);
        }
    }
    
    // Método para retirar valores na pilha
    char pop(int topo)
    {
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha < -1)
        {
            JOptionPane.showMessageDialog(null,"Pilha vazia!!! Erro..: -997");
            return('0');
        }
        else
        {
            return(this.pilha[this.topopilha +1]);
        }
    }
}