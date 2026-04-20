package com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Crea un ArrayList de EspacioCultural
        ArrayList<EspacioCultural> lugares = new ArrayList<>();

        // Agrega una instancia de cada lugar
        lugares.add(new JardinBotanico());
        lugares.add(new MuseoDeAntioquia());
        lugares.add(new ParqueExplora());

        // Usa un ciclo (for-each) para mostrar la información de todos los lugares
        for (EspacioCultural lugar : lugares) {
            System.out.println("Lugar: " + lugar.getClass().getSimpleName());
            lugar.mostrarHorario();
            System.out.println("Requisito: " + lugar.obtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
            System.out.println("--------------------------------------------------");
        }
    }
}