package Encapsulamiento;

public class Main {
    public static void main(String args[]) {
        /*Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el título del primer libro: ");
        String tituloLibro1 = entrada.nextLine();

        System.out.print("Ingrese el autor del primer libro: ");
        String autorLibro1 = entrada.nextLine();

        System.out.print("Ingrese el año de publicación del primer libro: ");
        int anioLibro1 = entrada.nextInt();
        entrada.nextLine();

        Libro libro1 = new Libro(tituloLibro1, autorLibro1, anioLibro1);

        System.out.print("\nIngrese el título del segundo libro: ");
        String tituloLibro2 = entrada.nextLine();

        System.out.print("Ingrese el autor del segundo libro: ");
        String autorLibro2 = entrada.nextLine();

        System.out.print("Ingrese el año de publicación del segundo libro: ");
        int anioLibro2 = entrada.nextInt();
        entrada.nextLine();

        Libro libro2 = new Libro(tituloLibro2, autorLibro2, anioLibro2);

        entrada.close();

        System.out.println("------------------------------");
        System.out.println("\nDetalles del primer libro:");
        mostrarDetallesLibro(libro1);

        System.out.println("------------------------------");
        System.out.println("\nDetalles del segundo libro:");
        mostrarDetallesLibro(libro2);
    }

    public static void mostrarDetallesLibro(Libro libro) {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicacion: " + libro.getAnioDePublicacion());
    }*/
// Crear instancias de libros
Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 1925);
Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

// Mostrar detalles iniciales
System.out.println("Detalles del libro 1:");
mostrarDetallesLibro(libro1);

System.out.println("\nDetalles del libro 2:");
mostrarDetallesLibro(libro2);

// Cambiar detalles de los libros
libro1.setTitulo("El Gran Gatsby (Edición Especial)");
libro2.setAnioPublicacion(1970);

// Mostrar detalles después de los cambios
System.out.println("\nDetalles del libro 1 después de cambiar el título:");
mostrarDetallesLibro(libro1);

System.out.println("\nDetalles del libro 2 después de cambiar el año de publicación:");
mostrarDetallesLibro(libro2);
}

// Método para mostrar los detalles de un libro
public static void mostrarDetallesLibro(Libro libro) {
System.out.println("Título: " + libro.getTitulo());
System.out.println("Autor: " + libro.getAutor());
System.out.println("Año de Publicación: " + libro.getAnioDePublicacion());
}
}

