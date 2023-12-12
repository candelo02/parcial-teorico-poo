public class Main {
    public static void main(String[] args) {
        Animal miAnimal;

        miAnimal = new Gato();
        miAnimal.hacerSonido();  // Salida: Miau, miau

        miAnimal = new Perro();
        miAnimal.hacerSonido();  // Salida: Guau, guau
    }
}