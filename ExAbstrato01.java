/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exabstrato01;

/**
 *
 * @author Usuario
 */
public class ExAbstrato01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo c = new Circulo("Circulo", 3);
       Quadrado q = new Quadrado("Quadrado", 4);
       Triangulo t = new Triangulo("Triangulo", 7, 8);
       
       System.out.println("Figura: " + c.getNome() + " Area: "+ c.calcularArea());
       System.out.println("Figura: " + q.getNome() + " Area: "+ q.calcularArea());
       System.out.println("Figura: " + t.getNome() +" Area: "+ t.calcularArea());
        
        
        
    }
    
}
