class Motocicleta extends Vehiculo {
    private boolean tieneMarchas;

    public Motocicleta(String marca, String modelo, boolean tieneMarchas) {
        super(marca, modelo);
        this.tieneMarchas = tieneMarchas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("¿Tiene Marchas? " + (tieneMarchas ? "Sí" : "No"));
    }
}

