class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando el vehículo.");
    }

    public void frenar() {
        System.out.println("Frenando el vehículo.");
    }

    public void imprimirInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

