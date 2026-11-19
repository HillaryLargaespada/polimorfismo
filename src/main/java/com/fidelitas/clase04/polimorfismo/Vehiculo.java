/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase04.polimorfismo;

/**
 *
 * @author JoRodr1
 */
public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected int annio;

    public Vehiculo(String marca, String modelo, int annio) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
    }
    
    /*Metodo abstracto: cada subclase debe definir su costo de mantenimiento*/
    public abstract double calcularCostoMantenimiento();
    
    /*Metodo normal: puede ser sobreescrito si la subclase desea añadir detalles especificos*/
    public String descripcion(){
        return String.format("%s %s (%d)", marca, modelo, annio );
    }
    
    /*Metodo final: las subclases NO pueden sobreescribirlos*/
    public final void imprimirDescripcion(){
        System.out.println("{Vehiculo}: " + descripcion());
    }
    
}
