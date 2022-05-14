/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author joaov
 */
public class ClassArPotenciaMedia implements ICommand {
    private ClassArCondicionado ar;

    public ClassArPotenciaMedia() {      
    }
    public ClassArPotenciaMedia(ClassArCondicionado ar) {
        this.ar = ar;
    }
    @Override
    public void execute() {
       ar.ligar();
       ar.refrigerar();
       ar.potenciaMedia();
       ar.potencia();
    }

    @Override
    public void diminuir() {
        ar.diminuir();
        ar.potencia();
    }

    @Override
    public void aumentar() {
        ar.aumentar();
        ar.potencia();
    }
    
}
