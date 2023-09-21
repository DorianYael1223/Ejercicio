package Ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(new Obrero("Juan", 1500));
        trabajadores.add(new Gerente("null", 3000));
        trabajadores.add(new Supervisor("Maria", 5000));
        trabajadores.add(new Gerente("Laura", 7000));
        trabajadores.add(new Supervisor("Carlos", 1500));
        trabajadores.add(new Supervisor("Jonny", 2500));
        trabajadores.add(new Obrero("Manuel", 1500));
        trabajadores.add(new Gerente("Cristian", 2500));

        System.out.println("Tabla de Pagos");
        System.out.println("------------------------------------------");
        System.out.printf("%-15s %-15s %-10s%n", "Nombre", "Puesto", "Sueldo");
        System.out.println("------------------------------------------");
        for (Trabajador trabajador : trabajadores) {
            String puesto = trabajador instanceof Obrero ? "Obrero" :
                            trabajador instanceof Supervisor ? "Supervisor" :
                            trabajador instanceof Gerente ? "Gerente" : "Empleado";
            double sueldo = trabajador.calcularSueldo();
            System.out.printf("%-15s %-15s $%-10.2f%n", trabajador.getNombre(), puesto, sueldo);
        }
        System.out.println("------------------------------------------");
    }
}
