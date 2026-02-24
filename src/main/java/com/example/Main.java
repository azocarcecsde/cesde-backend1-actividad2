package com.example;

public class Main {
    public static void main(String[] args) {
       // 5. Clase de Demostración
        System.out.println("--- Creando Objetos ---");
        // Crear al menos dos objetos de la clase Product
        Product producto1 = new Product("P123", "Laptop", 1200.0, 50);
        Product producto2 = new Product("P124", "Monitor", 300.50, 15);

        // Imprimimos el estado inicial usando el método toString()
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());

        System.out.println("\n--- Modificando con Setters ---");
        // Utilizar los métodos setter para modificar al menos un atributo de cada objeto
        producto1.setPrice(1150.0); // Hay descuento en la Laptop
        producto2.setStock(10);     // Se vendieron 5 monitores

        // Prueba de la validación (Puntos extra en acción)
        // producto1.setPrice(-50); // Si descomentas esta línea, verás el mensaje de error.

        System.out.println("Valores modificados exitosamente.");

        System.out.println("\n--- Imprimiendo con Getters ---");
        // Utilizar los métodos getter para imprimir al menos dos atributos de cada objeto
        System.out.println("Producto 1 -> Nombre: " + producto1.getName() + ", Nuevo Precio: $" + producto1.getPrice());
        System.out.println("Producto 2 -> Nombre: " + producto2.getName() + ", Stock Actual: " + producto2.getStock());

    }
}