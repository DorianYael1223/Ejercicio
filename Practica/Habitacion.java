package Practica;

public class Habitacion {
    private String nombre;
    private int numero;
    private double precioNoche;

    public Habitacion(String nombre, int numero, double precioNoche) {
        this.nombre = nombre;
        this.numero = numero;
        this.precioNoche = precioNoche;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }
    
    public void mostrarInformacion(){
        System.out.println("Habitacion: " + nombre);
        System.out.println("Numero de habitacion: " + numero);
        System.out.println("Precio por noche: $" + precioNoche);
    }
    public void mostrarPrecioPorNoche(){
        System.out.println("Tabla de precios por noche:");
    System.out.println("|--------------|----------|");
    System.out.println("|   Noches     |  Precio  |");
    System.out.println("|--------------|----------|");

    for (int noches = 1; noches <= 7; noches++) {
        double precioPorNoche = precioNoche * noches;
        System.out.printf("| %-12s | %8s |%n", noches, "$" + precioPorNoche);
        System.out.println("|--------------|----------|");
    }
}
}
