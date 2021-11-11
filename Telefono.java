public class Telefono{

    // Marca del teléfono
    private String marca;
    // Porcentaje de batería
    private int bateria;
    // Nombre app
    private App app;

    /**
     * Crea estructura del teléfono
     */
    public Telefono(String nombreMarca, int porcentajeBateria, App nombreApp) {
        marca = nombreMarca;
        bateria = porcentajeBateria;
        app = nombreApp;
    }