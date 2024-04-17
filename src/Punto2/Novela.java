package Punto2;

public class Novela extends Libro {
    String genero;

    public Novela(String titulo, String autor, int anoDePublicacion, String genero) {
        super(titulo, autor, anoDePublicacion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
