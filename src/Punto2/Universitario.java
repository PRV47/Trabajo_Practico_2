package Punto2;

public class Universitario extends Libro {
    String materia;
    String carrera;

    public Universitario(String titulo, String autor, int anoDePublicacion, String materia, String carrera) {
        super(titulo, autor, anoDePublicacion);
        this.materia = materia;
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
