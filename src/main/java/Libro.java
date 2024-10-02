public class Libro {
    String titulo;
    String autor;
    String genero;
    String ISBN;
    int cantidadDisponible;
    boolean disponible;

    public Libro(String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }

    public boolean prestar() {

    }

    public boolean devolver() {

    }

    @Override
    public String toString() {
        return "Titulo: "+this.titulo+"Autor: "+this.autor+"Genero: "+this.genero+"ISBN: "+this.ISBN +"Cantidad disponible: "+this.cantidadDisponible+"Disponible: "+this.disponible;
    }

}
