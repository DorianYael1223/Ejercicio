package EjercicioHerencia3;

public class PaletaCrema extends Paleta {
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }
    public void mostrarBaseCrema(){
        System.out.println("Base de crema: " + (cremosa ? "Si" : "No"));
    }
    public void nuevoPrecio(){
        double precionuevo = precio + 6; 
    System.out.println("El nuevo precio es: $" + precionuevo);
        
    }
    public void paletaGrandeOChica(){
        if(precio <=15){
            System.out.println("Es una paleta chica.");
        }else {
            System.out.println("Es una Paleta grande.");
        }
    }
}