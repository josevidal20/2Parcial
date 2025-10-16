package modelo;


public class Arma {
    private String nombre; 
    private int dañoAdicional; 

    /**
     * 
     * @param nombre 
     * @param dañoAdicional 
     */
    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    /**
     * 
     * @param objetivo 
     */
    public void atacarConArma(Criatura objetivo) {
        
        
        System.out.println(nombre + " ataca con " + nombre + "!");
        
        
    } 

    /**
     * 
     * @return 
     */
    public int getDañoAdicional() {
        return dañoAdicional;
    } 
    public String getNombre() {
        return nombre;
    }
}
