package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     
        CamionDeReparto camion = new CamionDeReparto("CAM-001", 100, 5000, true);
       
        BuqueCarga buque = new BuqueCarga("BUQ-999", 100, 50000, 50);

        System.out.println("=== 2. Prueba de Fuego (Validación) ===");
        System.out.println("Intentando asignar -20 de combustible al camión...");
        camion.setCombustible(-20);
        System.out.println("Combustible actual del camión: " + camion.getCombustible()); 
        
        camion.setCombustible(100); 

        System.out.println("\n=== 3. Demostración de Polimorfismo ===");
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        
        for (Transporte vehiculo : flota) {
            System.out.println("Vehículo: " + vehiculo.getIdTransporte() + " | Combustible inicial: " + vehiculo.getCombustible());
            
            vehiculo.viajar(100); 
            
            System.out.println("Combustible tras viajar 100km: " + vehiculo.getCombustible());
            System.out.println("------------------------------------------------");
        }
        
       
        System.out.println("\n=== Prueba de métodos propios ===");
        buque.mostrarDatos();
        buque.atracarEnPuerto();



    }
}