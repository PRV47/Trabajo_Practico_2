package Punto2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Novela("Los tres mosqueteros", "Alejandro Dumas", 1844, "Aventura"));
        biblioteca.agregarLibro(new Universitario("Quimica General", "Raymond Chang", 1990, "Quimica General", "Bioquimica"));
        biblioteca.agregarLibro(new Infantil("Las Cronicas de Narnia", "C.S. Lewis", 1956, "Novela", "Fantastico", 816));

        biblioteca.listarLibrosDisponibles();
        biblioteca.prestarLibro("Quimica General");
        System.out.println("------------------------------------");
        biblioteca.listarLibrosDisponibles();
        biblioteca.devolverLibro("Quimica General");
        biblioteca.prestarLibro("Las Cronicas de Narnia");
        System.out.println("------------------------------------");
        biblioteca.listarLibrosDisponibles();
    }
}
