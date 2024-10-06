import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inicializar();
    }

    public void inicializar() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("Biblioteca de Alejandría");

        Libro libro = new Libro("Star wars", "George lucas", "Ciencia ficcion", "2222",0,true);
        Libro libro1 = new Libro("Señor de los anillos", "Juan", "Ciencia ficcion", "3333", 5,true);
        Libro libro2 = new Libro("Bajo la misma estrella", "Pablo callunao", "Romance", "3333", 80, true);
        Libro libro3 = new Libro("Breaking bad","Netflix", "Comedia", "6464", 50, true);
        Libro libro4 = new Libro("Destiny","Juan","Ciencia ficcion", "4838", 60,true);
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro4);

        //Mostrar la lista de libros disponibles
        biblioteca.mostrarLibrosDisponibles();
        //Prestar un libro y volver a mostrar la lista de libros disponibles.
        biblioteca.prestarLibro("Star wars");
        biblioteca.mostrarLibrosDisponibles();

        // Devolver un libro y mostrar nuevamente la lista de libros disponibles.
        biblioteca.devolverLibro("Señor de los anillos");
        biblioteca.mostrarLibrosDisponibles();

        //Buscar un libro por su título.
        System.out.println(biblioteca.buscarLibro("Breaking bad").mostrarInfo());

        //Buscar libros de un autor específico
        biblioteca.mostrarLibros(biblioteca.buscarLibroPorAutor("Juan"));

        //Eliminar un libro de la biblioteca y mostrar la lista actualizada de libros
        biblioteca.eliminarLibro("Bajo la misma estrella");
        biblioteca.mostrarLibrosDisponibles();

    }
}
