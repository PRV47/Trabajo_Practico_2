package Punto1;

public class Pez extends Animal {
    String color;
    String especie;
    String region;

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String color, String especie, String region) {
        super(nombre, edad, "Pez", precio);
        this.color = color;
        this.especie = especie;
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
