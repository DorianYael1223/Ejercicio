package Practica;

public class HabitacionFamiliar extends Habitacion{
    private int numeroHabitaciones;

    public HabitacionFamiliar(String nombre, int numero, double precioNoche, int numHabitaciones) {
        super(nombre, numero, precioNoche);
        this.numeroHabitaciones = numHabitaciones;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numeroHabitaciones);
    }
    public void mostrarPrecioPorNoche(){
        super.mostrarPrecioPorNoche();
    }
}

