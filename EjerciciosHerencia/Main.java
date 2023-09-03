package EjerciciosHerencia;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00");
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0] = new Circulo("Circulo", 15);
        figuras[1] = new Rectangulo("Rectangulo", 15.5, 30.3);
        figuras[2] = new Triangulo("Triangulo", 10.6, 8.3);

        System.out.println("Tabla de áreas:");
        System.out.println("|--------------|----------|");
        System.out.println("|    Figura    |   Área   |");
        System.out.println("|--------------|----------|");

        for (FiguraGeometrica figura : figuras) {
            double area = figura.CalcularArea();
            System.out.printf("| %-12s | %8s |%n", figura.nombreFigura, format1.format(area));
            System.out.println("|--------------|----------|");

        }
    }
}
