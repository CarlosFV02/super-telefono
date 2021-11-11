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
    
    /**
     * Devuelve la marca del movil
     */
    public String getMarca() {
        return marca;
    }   
    
    /**
     * Devuelve la batería del movil
     */
    public int getBateria() {
        return bateria;
    }  
    
    /**
     * Devuelve el nombre de la app
     */
    public App getNombreApp() {
        return app;
    }  
    
    /**
     * Establece nombre de la marca
     */
    public void setMarca(String nombreNuevoMarca) {
        marca = nombreNuevoMarca;
    }   
    
    /**
     * Establece nombre del modelo
    */
    public void setBateria(int nuevaBateria) {
        bateria = nuevaBateria;
    }  
    
    /**
     * Establece el nombre de la app
    */
    public void setApp(App nombreNuevoApp) {
        app = nombreNuevoApp;
    }
}