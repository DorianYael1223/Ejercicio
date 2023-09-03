package EjercicioHerencia3;

public class Paleta {
    protected String sabor;
    protected double precio;
    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }
    public void mostrarInformacion(){
        System.out.println("Sabor: " + sabor + ", precio: $" + precio);
    }
}
