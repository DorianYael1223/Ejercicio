public class Persona {
    private String nombre;
    private int  edad;

    public Persona(String nombre2, int edad2) {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String mostrarInfo(){
        return "nombre" + nombre;
    }
    
}