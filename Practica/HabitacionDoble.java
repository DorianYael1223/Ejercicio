package Practica;

public class HabitacionDoble extends Habitacion {
    private int numDeCamas;

    public HabitacionDoble(String nombre, int numero, double precioNoche, int numDeCamas) {
        super(nombre ,numero, precioNoche);
        this.numDeCamas = numDeCamas;
    }
    
    public int getNumeroDeCamas(){
        return numDeCamas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numDeCamas);
    }
    public void mostrarPrecioPorNoche(){
        super.mostrarPrecioPorNoche();
    }
}
