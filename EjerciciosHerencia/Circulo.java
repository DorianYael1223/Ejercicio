package EjerciciosHerencia;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombreFigura, double radio) {
        super(nombreFigura);
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI*(Math.pow(radio,2));
    }
}
