package Punto2;

public class Infantil extends Libro {
    String genero;
    String subgenero;
    int paginas;

    public Infantil(String titulo, String autor, int anoDePublicacion, String genero, String subgenero, int paginas) {
        super(titulo, autor, anoDePublicacion);
        this.genero = genero;
        this.paginas = paginas;
        this.subgenero = subgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
