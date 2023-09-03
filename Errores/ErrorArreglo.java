package Errores;

public class ErrorArreglo {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3 };
        int index = 6;

        try {
            int value = myArray[index];
            System.out.println("El valor en la posición " + index + " es: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + index + " esta fuera de los limites del arreglo.");
        }
    }
}
