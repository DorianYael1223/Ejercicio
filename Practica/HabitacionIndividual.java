package Practica;

public class HabitacionIndividual extends Habitacion {
    private boolean tieneVistaAlMar;

    public HabitacionIndividual(String nombre, int numero, double precioNoche, boolean tieneVistaAlMar) {
        super(nombre, numero, precioNoche);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean isTieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
    }
    public void mostrarPrecioPorNoche(){
        super.mostrarPrecioPorNoche();
    }
}

