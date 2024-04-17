package Punto1;

public class Gato extends Animal {
    String raza;
    boolean esterilizado;

    public Gato(String nombre, int edad, double precio, String raza, boolean esterilizado) {
        super(nombre, edad, "Gato", precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
