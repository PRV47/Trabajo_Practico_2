package Punto2;

public abstract class Libro implements Prestable {
    String titulo;
    String autor;
    int anoDePublicacion;
    boolean prestado;

    public Libro(String titulo, String autor, int anoDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacion = anoDePublicacion;
        this.prestado = false;
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

    public int getAnoDePublicacion() {
        return anoDePublicacion;
    }

    public void setAnoDePublicacion(int anoDePublicacion) {
        this.anoDePublicacion = anoDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    public boolean estaPrestado() {
        return prestado;
    }
}
