/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase04.polimorfismo;

/**
 *
 * @author JoRodr1
 */
public class AutomovilCombustion extends Vehiculo {

    private double cilindradaLitros; // ej. 1.6, 2.0

    public AutomovilCombustion(double cilindradaLitros, String marca, String modelo, int annio) {
        super(marca, modelo, annio);
        this.cilindradaLitros = cilindradaLitros;
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        double base = 120.0;
        double porCilindrada = cilindradaLitros * 50.0;
        int antiguedad = Math.max(0, java.time.Year.now().getValue() - annio);
        double porAntiguedad = antiguedad * 15.0;
        return base + porCilindrada + porAntiguedad;        
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " - Combustion (" + cilindradaLitros  +"L)";
    }

}
