/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author 201911240039
 */
public class ClassArPotenciaMaxima implements ICommand{
    private ClassArCondicionado ar;

    public ClassArPotenciaMaxima() {}
    
    public ClassArPotenciaMaxima(ClassArCondicionado ar) {
        this.ar = ar;
    }
    @Override
    public void execute() {
       ar.ligar();
       ar.refrigerar();
       ar.potenciaMaxima();
       ar.potencia();
    }
    
}
