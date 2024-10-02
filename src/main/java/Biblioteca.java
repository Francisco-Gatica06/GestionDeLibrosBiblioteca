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

    // Revisar
    public void mostrarLibrosDisponibles(boolean disponible) {
        for(Libro libro : this.libros) {
            if(libro.disponible == true) {
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
