/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exabstrato01;

/**
 *
 * @author Usuario
 */
public abstract class FiguraGeometrica {
    private String nome;
    
    public FiguraGeometrica(String nome){
        this.nome = nome;
    }
            
    public abstract double calcularArea();
        
    public String getNome(){
        return this.nome;
    }
    
}
