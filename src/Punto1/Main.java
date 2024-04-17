package Punto1;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();

        tienda.addAnimal(new Perro("Ozzy", 9, 10, "Pichicho", true));
        tienda.addAnimal(new Gato("Retro", 1, 50, "Tuxedo", true));
        tienda.addAnimal(new Ave("Boid", 2, 24, "Canario", false));
        tienda.addAnimal(new Pez("Maca", 4, "Marlin", 560, "Azul", "Aguja Azul", "Atlantico"));

        tienda.listarAnimales();
        tienda.alimentarAnimal("Ozzy");
        tienda.alimentarAnimal("Retro");
        tienda.alimentarAnimal("Boid");
        tienda.alimentarAnimal("Maca");
        tienda.venderAnimal("Ozzy");
        tienda.venderAnimal("Retro");
        tienda.venderAnimal("Boid");
        tienda.listarAnimales();
    }
}
