/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exabstrato01;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
      
        return 3.14 * this.raio * this.raio;
        
    }

    

    

    
    
}
