interface MiInterfaz {
    // Método abstracto que debe ser implementado por las clases que implementan la interfaz
    void metodoAbstracto();

    // Método default con implementación predeterminada
    default void metodoConImplementacion() {
        System.out.println("Implementación predeterminada en la interfaz.");
    }
}