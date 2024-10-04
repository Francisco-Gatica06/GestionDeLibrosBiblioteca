import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    private List<Libro> libros;

    public Biblioteca() {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Primero ver que ese libro no exista, si existe aumentarlo en 1.
    public boolean agregarLibro(Libro libro) {
        return true;
    }

    public boolean agregarLibro(String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible) {
        return true;
    }

    // Revisar
    public Libro buscarLibro(String ISBN, String titulo) {
        for(Libro libro : this.libros) {
            if(libro.getISBN().equals(ISBN) && libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // Revisar
    public void mostrarLibrosDisponibles(boolean disponible) {
        for(Libro libro : this.libros) {
            if(libro.disponible) {
                System.out.println(libro.toString());
            }
        }
    }

    // Revisar
    public List buscarLibroPorTitulo(String titulo) {
        ArrayList<Libro> librosTitulo = new ArrayList<>();
        for(Libro libro : this.libros) {
            if(libro.getTitulo().equals(titulo)) {
                librosTitulo.add(libro);
            }
        }
        return librosTitulo;
    }

}
