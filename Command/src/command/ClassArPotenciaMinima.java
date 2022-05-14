/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author joaov
 */
public class ClassArPotenciaMinima implements ICommand {
    private ClassArCondicionado ar;

    public ClassArPotenciaMinima() {
        
    }
    public ClassArPotenciaMinima(ClassArCondicionado ar) {
        this.ar = ar;
    }
        
    @Override
    public void execute() {
        ar.ligar();
        ar.refrigerar();
        ar.potenciaMinima();
        ar.potencia();
    }
    
}
