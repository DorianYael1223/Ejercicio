package EjerciciosHerencia;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombreFigura, double base, double altura) {
        super(nombreFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
    }
}
