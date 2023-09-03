package Errores;

import java.util.Scanner;

public class ErrorEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
            System.out.print("Ingresa un número: ");
            double number = Double.parseDouble(scanner.nextLine());
            System.out.println("El número ingresado es: " + number);
            System.out.println("Error: Ingresa un número válido.");
            scanner.close();
        }
    }

