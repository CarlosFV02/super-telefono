public class Telefono{

    // Marca del tel�fono
    private String marca;
    // Porcentaje de bater�a
    private int bateria;
    // Nombre app
    private App app;

    /**
     * Crea estructura del tel�fono
     */
    public Telefono(String nombreMarca, int porcentajeBateria, App nombreApp) {
        marca = nombreMarca;
        bateria = porcentajeBateria;
        app = nombreApp;
    }