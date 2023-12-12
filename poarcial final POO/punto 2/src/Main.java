
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la subclase (Automovil)
        Automovil miAutomovil = new Automovil();

        // Llamar al método arrancar de la subclase
        miAutomovil.arrancar();

        // Crear una instancia de la superclase (Vehiculo)
        Vehiculo miVehiculo = new Vehiculo();

        // Llamar al método arrancar de la superclase
        miVehiculo.arrancar();

        // Polimorfismo: Utilizar una referencia de la superclase para un objeto de la subclase
        Vehiculo otroAutomovil = new Automovil();
        otroAutomovil.arrancar();
    }
}