package Ejercicio;

public class Supervisor extends Trabajador {

    public Supervisor(String nombre, double sueldo) {
        super(nombre, "Supervisor", sueldo);
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo();
    }
}
