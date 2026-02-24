package com.example;

public class Product {
    // 1. Atributos de instancia (4 atributos de diferentes tipos)
    private String id;
    private String name;
    private double price;
    private int stock;

    // Constructor vacío (opcional, pero buena práctica)
    public Product() {
    }

    // Constructor con parámetros para facilitar la creación
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price); // Usamos el setter para aprovechar la validación
        setStock(stock); // Usamos el setter para aprovechar la validación
    }

    // 2. Implementación de Métodos Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // 3. Implementación de Métodos Setter (¡Con puntos extra de validación!)
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        // Validación: El precio no puede ser negativo
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        // Validación: El stock no puede ser negativo
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    // 4. Método toString()
    @Override
    public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";
    }
}