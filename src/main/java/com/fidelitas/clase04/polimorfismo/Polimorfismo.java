/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase04.polimorfismo;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author JoRodr1
 */
public class Polimorfismo {

    public static void main(String[] args) {
        
        //crear una colección o lista de vehiculos y vamos a agregar 3 vehiculos diferentes
        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new AutomovilCombustion(1.8,"Toyota", "Corolla", 2020));
        flota.add(new Motocicleta(true, "Yamaha", "Ninja", 2022));
        flota.add(new AutomovilElectrico(60, 100, "Tesla", "Model 3", 2021));
        
        //recorrer la coleccion
        for(Vehiculo v: flota) {
            v.imprimirDescripcion();
            double costo = v.calcularCostoMantenimiento();
            System.out.println("Costo mantenimiento: " + costo);
            System.out.println();
        }
    }
}
