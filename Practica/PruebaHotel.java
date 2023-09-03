package Practica;

import java.util.Scanner;

public class PruebaHotel {
    public static void main(String[] args) {
        int opcion;
        Scanner consola = new Scanner(System.in);
        Habitacion habitacion1 = new HabitacionIndividual("Individual", 202, 500, true);
        Habitacion habitacion2 = new HabitacionDoble("Doble", 303, 1000, 2);
        Habitacion habitacion3 = new HabitacionFamiliar("Familiar", 404, 1300, 4);
        Habitacion habitacion4 = new HabitacionSuite("Suite", 505, 2000, true);

        do {
            System.out.println("-----------------------");
            System.out.println("Elige una opcion");
            System.out.println("1.-Ver habitaciones");
            System.out.println("2.-Ver precios por noche");
            System.out.println("3.-Salir");
            System.out.println("Eleige tu opcion.");
            System.out.println("-------------------------");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Primera habitacion: ");
                    habitacion1.mostrarInformacion();
                    System.out.println();

                    System.out.println("Segunda habitacion: ");
                    habitacion2.mostrarInformacion();
                    System.out.println();

                    System.out.println("Tercera habitacion: ");
                    habitacion3.mostrarInformacion();
                    System.out.println();

                    System.out.println("Cuarta habitacion: ");
                    habitacion4.mostrarInformacion();
                    System.out.println();
                    break;

                case 2:
                    habitacion1.mostrarPrecioPorNoche();
                    System.out.println();
                    habitacion2.mostrarPrecioPorNoche();
                    System.out.println();
                    habitacion3.mostrarPrecioPorNoche();
                    System.out.println();
                    habitacion4.mostrarPrecioPorNoche();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }
        } while (opcion != 3);
        consola.close();
    }
}