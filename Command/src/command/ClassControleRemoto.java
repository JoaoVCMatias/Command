/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author 201911240039
 */
public class ClassControleRemoto {
    ICommand comando;
    
    public void ClassControleRemoto(){
    }
    
    public void setCommand(ICommand comando){
        this.comando = comando;
        
    }
    public void botaoPressionado(){
        this.comando.execute();
    }
    public void botaoDiminuirPressionado(){
        this.comando.diminuir();
    }
    public void botaoAumentarPressionado(){
        this.comando.aumentar();
    }
}
