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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible (boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if(getDisponible()) {
            setCantidadDisponible(getCantidadDisponible() - 1);
            if (getCantidadDisponible() == 0) {
                setDisponible(false);
            }
        }
    }

    public void devolver() {
        if(!getDisponible()) {
            setCantidadDisponible(getCantidadDisponible() + 1);
            setDisponible(true);
        } else {
            setCantidadDisponible(getCantidadDisponible() + 1);
        }
    }

    public void aumentarCantidadDisponible() {
        setCantidadDisponible(getCantidadDisponible() + 1);
    }

    public String mostrarInfo() {
        return "Titulo: "+this.titulo+" Autor: "+this.autor+" Genero: "+this.genero+" ISBN: "+this.ISBN +" Cantidad disponible: "+this.cantidadDisponible+" Disponible: "+this.disponible;
    }

}
