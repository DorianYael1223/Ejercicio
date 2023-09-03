package Encapsulamiento;

public class Libro {
    private String titulo; 
    private String autor;
    private int anioDePublicacion;

    public Libro (String titulo, String autor, int anioDePublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public void setAnioPublicacion(int i) {
    }
}
