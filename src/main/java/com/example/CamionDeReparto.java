package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    
    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    
    @Override
    public void viajar(int distancia) {
        if (tieneRefrigeracion) {
            // Consumo doble: 2 unidades por cada 10km
            double consumo = (distancia / 10.0) * 2;
            setCombustible(getCombustible() - consumo);
        } else {
            // Se comporta como un transporte normal
            super.viajar(distancia);
        }
    }
}