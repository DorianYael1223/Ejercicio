package Encapsulamiento2;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }

    //Metodo para cambiar y obtener el nombre 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo para cambiar y obtener la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para cambiar y obtener el Salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSueldo(double d) {
    }

    public String getSueldo() {
        return null;
    }
    
}
