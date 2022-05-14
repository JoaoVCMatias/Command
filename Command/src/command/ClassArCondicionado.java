/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author 201911240039
 */
public class ClassArCondicionado {
    private int arPotencia = 22;
    private int valorMaximo = 30;
    private int valorMinimo = 12;
    
    public void ligar(){
        System.out.println("Ar condicionado ligado!");
    }
    public void desligar(){
        System.out.println("Ar condicionado desligado");
    }
    public void diminuir(){
        this.arPotencia-=1;
    }
    public void aumentar(){
        this.arPotencia+=1;
    }
    public void ventilar(){
        System.out.println("Modo ventilar");
    }
    public void refrigerar(){
        System.out.println("Modo refrigerar");
    }
    public void potencia(){
        System.out.println("Potencia atual: " + this.arPotencia);
    }
    public void potenciaMaxima(){
        this.arPotencia = valorMaximo;
    }
    public void potenciaMinima(){
        this.arPotencia = valorMinimo;
    }
    public void potenciaMedia(){
        this.arPotencia = (valorMaximo + valorMinimo) / 2;
    }
    
    
}
