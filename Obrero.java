package Ejercicio;

public class Obrero extends Trabajador {
    public Obrero(String nombre, double sueldo) {
        super(nombre, "Obrero", sueldo);
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo();
    }

}