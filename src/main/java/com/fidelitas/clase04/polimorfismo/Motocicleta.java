/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase04.polimorfismo;

/**
 *
 * @author JoRodr1
 */
public class Motocicleta extends Vehiculo {
    
    private boolean esDeportiva;

    public Motocicleta(boolean esDeportiva, String marca, String modelo, int annio) {
        super(marca, modelo, annio);
        this.esDeportiva = esDeportiva;
    }

    @Override
    public double calcularCostoMantenimiento() {
        double base = 90.0;
        if (esDeportiva) base += 60.0;
        int antiguedad = Math.max(0, java.time.Year.now().getValue() - annio);
        return base + antiguedad * 8.0;
    }
    
    @Override
    public String descripcion() {
        return super.descripcion() + (esDeportiva ? " - Moto deportiva" : "- Moto estandar");
    }
    
}
