package Punto1;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas {
    private List<Animal> animales;

    public TiendaMascotas() {
        this.animales = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
            animales.add(animal);
    }
    public void venderAnimal(String nombre) {
        animales.removeIf(animal -> animal.nombre.equals(nombre));
    }
    public void alimentarAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.nombre.equals(nombre)) {
                    animal.alimentar();
                    break;
                }
        }
    }
    public void listarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal);
            }
        }
}
