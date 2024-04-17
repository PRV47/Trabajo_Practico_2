package Punto1;

public class Ave extends Animal {
    String especie;
    boolean habla;

    public Ave(String nombre, int edad, double precio, String especie, boolean habla) {
        super(nombre, edad, "Ave", precio);
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}
