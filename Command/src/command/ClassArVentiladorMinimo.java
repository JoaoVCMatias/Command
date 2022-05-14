/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author joaov
 */
public class ClassArVentiladorMinimo implements ICommand {
    private ClassArCondicionado ar;

    public ClassArVentiladorMinimo() {
    }
    public ClassArVentiladorMinimo(ClassArCondicionado ar) {
        this.ar = ar;
    }
    @Override
    public void execute() {
        ar.ligar();
        ar.ventilar();
        ar.potenciaMinima();
        ar.potencia();
    }
    
}
