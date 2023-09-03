package Encapsulamiento2;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 30, 3800);
        Empleado empleado2 = new Empleado("Francisco", 32, 5000);

        System.out.println("\nDetalles de los empleados: ");
        System.out.println("\nEmpleado 1:");
        mostrarEmpleado(empleado1);

        System.out.println("\nEmpleado 2");
        mostrarEmpleado(empleado2);

        empleado1.setSalario(2800.0);
        System.out.println("\nNuevo sueldo empleado 1: " + empleado1.getSalario());
    }
    //Se accede a los datos a traves de metodos publicos 
    public static void mostrarEmpleado(Empleado empleado){
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Sueldo: " + empleado.getSalario());
    }
}