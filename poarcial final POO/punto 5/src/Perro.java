class Perro extends Animal {
    // Sobrescritura del método hacerSonido de la superclase Animal
    @Override
    void hacerSonido() {
        System.out.println("EL PERRO HACE => Guau, guau");
    }
}