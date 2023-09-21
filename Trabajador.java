package Ejercicio;

class Trabajador {
    private String nombre;
    private String puesto;
    protected double sueldo;

    public Trabajador(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
   
}