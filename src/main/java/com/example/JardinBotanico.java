package com.example;

public class JardinBotanico implements EspacioCultural {
    @Override
    public void mostrarHorario() {
        System.out.println("Horario: 9:00 AM - 4:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Entrada libre (algunos eventos requieren registro)";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Caminando por el Bosque Tropical...");
    }
}
