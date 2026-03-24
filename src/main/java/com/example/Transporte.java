package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

   
    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible); 
        setCapacidadCarga(capacidadCarga);
    }

    // Getters
    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    // Setters con lógica
    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if (nivel > 100) {
            this.combustible = 100;
        } else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: La capacidad de carga no puede ser negativa.");
        } else {
            this.capacidadCarga = carga;
        }
    }

    // Método viajar
    public void viajar(int distancia) {
        // 1 unidad por cada 10km
        double consumo = (distancia / 10.0) * 1; 
        setCombustible(this.combustible - consumo);
    }

}
