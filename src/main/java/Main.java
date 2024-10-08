

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inicializar();
    }

    public void inicializar() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("Biblioteca de Alejandría");

        Libro libro = new Libro("Star wars", "George lucas", "Ciencia ficcion", "2222",3,true);
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro("2012", "Netflix", "Terror", "91919", 505,true);


        //Mostrar la lista de libros disponibles
        biblioteca.mostrarLibrosDisponibles();
//        //Prestar un libro y volver a mostrar la lista de libros disponibles.
        biblioteca.prestarLibro("Star wars");
        biblioteca.mostrarLibrosDisponibles();
//
//        // Devolver un libro y mostrar nuevamente la lista de libros disponibles.
        biblioteca.devolverLibro("Star wars");
        biblioteca.mostrarLibrosDisponibles();
//
//        //Buscar un libro por su título.
        System.out.println(biblioteca.buscarLibro("2012").mostrarInfo());
//        //Buscar libros de un autor específico
        biblioteca.mostrarLibros(biblioteca.buscarLibroPorAutor("Netflix"));
//
//        //Eliminar un libro de la biblioteca y mostrar la lista actualizada de libros
        biblioteca.eliminarLibro("2012");
        biblioteca.mostrarLibrosDisponibles();

    }
}
