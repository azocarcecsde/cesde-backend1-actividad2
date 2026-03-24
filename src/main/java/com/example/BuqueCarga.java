package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

   
    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

   
    public void atracarEnPuerto() {
        System.out.println("El buque " + getIdTransporte() + " está listo para descarga.");
    }

    
    public void mostrarDatos() {
        System.out.println("--- Datos del Buque ---");
        System.out.println("ID: " + getIdTransporte());
        System.out.println("Combustible: " + getCombustible() + "%");
        System.out.println("Capacidad de Carga: " + getCapacidadCarga() + " kg");
        System.out.println("Contenedores: " + cantidadContenedores);
    }
}