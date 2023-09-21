package Ejercicio;

public class Gerente extends Trabajador {
    public Gerente(String nombre, double sueldo) {
        super(nombre, "Gerente", sueldo);
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo();
    }
}
