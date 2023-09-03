package Errores;

public class ErrorDivision {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division entre cero.");
        }
    }
}
