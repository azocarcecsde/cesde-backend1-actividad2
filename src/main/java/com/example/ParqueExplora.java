package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Horario: 10:00 AM - 6:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Boleta pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Interactuando con experimentos de física y visitando el acuario...");
    }
}
