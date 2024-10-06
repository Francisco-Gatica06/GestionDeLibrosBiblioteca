public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inicializar();
    }

    public void inicializar() {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Star wars", "George lucas", "Ciencia ficcion", "2222",3,true);
        Libro libro1 = new Libro("Señor de los anillos", "Juan", "Ciencia ficcion", "3333", 5,true);
        Libro libro2 = new Libro("Bajo la misma estrella", "Pablo callunao", "Romance", "3333", 80, true);
        Libro libro3 = new Libro("Breaking bad","Netflix", "Comedia", "6464", 50, true);

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro1);
    }
}
