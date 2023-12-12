public class EjemploHerencia {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Automovil miAutomovil = new Automovil("Toyota", "Corolla", 4);
        Motocicleta miMotocicleta = new Motocicleta("Honda", "CBR", true);

        // Llamar a métodos de la superclase y subclases
        miAutomovil.acelerar();
        miMotocicleta.frenar();

        // Llamar a métodos específicos de las subclases
        miAutomovil.imprimirInformacion();
        miMotocicleta.imprimirInformacion();
    }
}