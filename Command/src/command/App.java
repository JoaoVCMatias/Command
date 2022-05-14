/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

/**
 *
 * @author 201911240039
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassControleRemoto controleAr1 = new ClassControleRemoto();
        controleAr1.setCommand(new ClassArPotenciaMaxima(new ClassArCondicionado()));
        controleAr1.botaoPressionado();
        System.out.println("---------------------------------------");
        ClassControleRemoto controleAr2 = new ClassControleRemoto();
        controleAr1.setCommand(new ClassArPotenciaMinima(new ClassArCondicionado()));
        controleAr1.botaoPressionado();
        System.out.println("---------------------------------------");
        ClassControleRemoto controleAr3 = new ClassControleRemoto();
        controleAr1.setCommand(new ClassArPotenciaMedia(new ClassArCondicionado()));
        controleAr1.botaoPressionado();
        System.out.println("---------------------------------------");
        ClassControleRemoto controleAr4 = new ClassControleRemoto();
        controleAr1.setCommand(new ClassArVentiladorMedia(new ClassArCondicionado()));
        controleAr1.botaoPressionado();
        System.out.println("---------------------------------------");
        ClassControleRemoto controleAr5 = new ClassControleRemoto();
        controleAr1.setCommand(new ClassArVentiladorMaximo(new ClassArCondicionado()));
        controleAr1.botaoPressionado();
        System.out.println("---------------------------------------");
        ClassControleRemoto controleAr6 = new ClassControleRemoto();
        controleAr1.setCommand(new ClassArVentiladorMinimo(new ClassArCondicionado()));
        controleAr1.botaoPressionado();
    }
    
}
