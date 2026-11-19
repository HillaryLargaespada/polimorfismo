/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase04.polimorfismo;

/**
 *
 * @author JoRodr1
 */
public class AutomovilElectrico extends Vehiculo implements Electrico {
    
    private int capacidadKwh;
    private int nivel;

    public AutomovilElectrico(int capacidadKwh, int nivel, String marca, String modelo, int annio) {
        super(marca, modelo, annio);
        this.capacidadKwh = capacidadKwh;
        this.nivel = 60;
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        double base = 80.0;
        int antiguedad = Math.max(0, java.time.Year.now().getValue() - annio);
        double porAntiguedad = antiguedad * 10.0;
        return base + porAntiguedad;
    }
    
    @Override
    public String descripcion() {
        return super.descripcion() + " - Electrico (" + capacidadKwh  +"kwH)";
    }

    @Override
    public void cargar(int kWh) {
        this.nivel = Math.min(100, this.nivel + kWh);
    }

    @Override
    public int nivelBateria() {
        return nivel;
    }
    
}
