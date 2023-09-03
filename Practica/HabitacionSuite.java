package Practica;

public class HabitacionSuite extends Habitacion{
    private boolean sala;

    public HabitacionSuite(String nombre, int numero, double precioNoche, boolean sala) {
        super(nombre, numero, precioNoche);
        this.sala = sala;
    }

    public boolean isSala() {
        return sala;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene sala: " + (sala ? "Si" : "No"));
    }
    public void mostrarPrecioPorNoche(){
        super.mostrarPrecioPorNoche();
    }
}

