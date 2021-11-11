public class App{

    // Nombre de la app
    private String nombre;
    // Tipo de la app
    private String tipo;

    /**
     * Crea estructura de la app
     */
    public App(String nombreApp, String tipoSerie) {
        nombre = nombreApp;
        tipo = tipoSerie;
    }
    
    /**
     * Devuelve el nombre de la app
     */
    public String getNombre() {
        return nombre;
    }   
    
    /**
     * Devuelve el tipo de la app
     */
    public String getTipo() {
        return tipo;
    }  

     /**
     * Establece el nombre de la app
     */
    public void setNombre(String nombreApp) {
        nombre = nombreApp;
    }   
    
    /**
     * Establece el tipo de la app
    */
    public void setTipo(String tipoApp) {
        tipo = tipoApp;
    }  
    
    /**
    * Imprime detalles app
    */
    public void imprimirDetalles() {
    System.out.println("Nombre de la app: " + nombre + " / Tipo de la app: " + tipo);
    }
}