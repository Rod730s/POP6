package fi.poo;

/**
 * Clase que representa un coche con sus atributos y funciones.
 * 
 * @author Rodrigo Cer�n
 */
public class Coche {
    
    private String color;
    private String marca;
    private String placa;
    
    /**
     * Constructor por defecto de la clase Coche.
     */
    public Coche() {
        // Constructor vacío
    }
    
    /**
     * Constructor que inicializa un coche con el color, marca y placa proporcionados.
     * 
     * @param color El color del coche.
     * @param marca La marca del coche.
     * @param placa La placa del coche.
     */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }
    
    /**
     * Obtiene el color del coche.
     * 
     * @return El color del coche.
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Establece el color del coche.
     * 
     * @param color El color del coche.
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Obtiene la marca del coche.
     * 
     * @return La marca del coche.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Establece la marca del coche.
     * 
     * @param marca La marca del coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Obtiene la placa del coche.
     * 
     * @return La placa del coche.
     */
    public String getPlaca() {
        return placa;
    }
    
    /**
     * Establece la placa del coche.
     * 
     * @param placa La placa del coche.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * Carga un objeto en el coche.
     * 
     * @param cosa El objeto que se va a cargar en el coche.
     * @return Un mensaje indicando que el objeto fue cargado.
     */
    public String carga(String cosa) {
        return "Cargando " + cosa + " en el coche.";
    }
    
    /**
     * Devuelve una representación en cadena de los atributos del coche.
     * 
     * @return Una cadena con la información del coche.
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
}
