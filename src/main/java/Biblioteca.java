import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    private List<Libro> libros;

    public Biblioteca() {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // revisar probables errores con setDisponible.
    public boolean agregarLibro(Libro libro) {
        if(buscarLibro(libro.getISBN(), libro.getTitulo()) == null) {
            this.libros.add(libro);
            return true;
        } else if(existeLibro(libro.getISBN())) {
            libro.setCantidadDisponible(libro.getCantidadDisponible() + 1);
            libro.setDisponible(true);
            return true;
        } else {
            return false;
        }
    }

    // agregar si es que el libro que se agrega existe aumentarlo en 1.
    public boolean agregarLibro(String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible) {
        if(buscarLibro(ISBN, titulo) == null) {
            Libro libro = new Libro(titulo,autor,genero,ISBN,cantidadDisponible,disponible);
            this.libros.add(libro);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarLibro(String titulo) {
      Libro libro = this.buscarLibro(titulo);
      if(libro != null) {
          this.libros.remove(libro);
          return true;
      } else {
          return false;
      }
    }

    public boolean prestarLibro(String titulo) {
        Libro libro = this.buscarLibro(titulo);
        if(libro != null && libro.getDisponible()) {
            libro.prestar();
            return true;
        } else {
            return false;
        }
    }

    public boolean devolverLibro(String titulo) {
        Libro libro = this.buscarLibro(titulo);
        if(libro != null && !libro.getDisponible()) {
            libro.devolver();
            libro.setDisponible(true);
            return true;
        } else if (libro != null) {
            libro.devolver();
            return true;
        } else {
            return false;
        }
    }

    public void mostrarLibrosDisponibles() {
        for(Libro libro : this.libros) {
            if(libro.getDisponible()) {
                System.out.println(libro.mostrarInfo());
            }
        }
    }

    public void mostrarLibros(List<Libro> libros) {
        for(Libro libro : libros) {
            System.out.println(libro.mostrarInfo());
        }
    }

    public List buscarLibroPorTitulo(String titulo) {
        ArrayList<Libro> librosTitulo = new ArrayList<>();
        for(Libro libro : this.libros) {
            if(libro.getTitulo().equals(titulo)) {
                librosTitulo.add(libro);
            }
        }
        return librosTitulo;
    }

    public List buscarLibroPorAutor(String autor) {
        ArrayList<Libro> librosAutor = new ArrayList<>();
        for(Libro libro : this.libros) {
            if(libro.getAutor().equals(autor)) {
                librosAutor.add(libro);
            }
        }
        return librosAutor;
    }

    public boolean existeLibro(String ISBN) {
        for(Libro libro : this.libros) {
            if(libro.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    public Libro buscarLibro(String ISBN, String titulo) {
        for(Libro libro : this.libros) {
            if(libro.getISBN().equals(ISBN) && libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibro(String titulo) {
        for(Libro libro : this.libros) {
            if(libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
