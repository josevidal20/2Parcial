package modelo;


public abstract class Criatura {
    protected String nombre; 
    protected int salud; 
    protected int fuerza; 
    protected Arma armaEquipada; 

    /**
     * 
     * @param nombre 
     * @param salud 
     * @param fuerza 
     */
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    
    /**
     * 
     * 
     * @param objetivo 
     */
    public abstract void atacar(Criatura objetivo); 

    /**
     * 
     * @param daño 
     */
    public abstract void defender(int daño); 

   

    /**
     * 
     * @return 
     */
    public boolean estaViva() {
        return salud > 0;
    } 
    

    /**
     * 
     * @param arma 
     */
    public void equiparArma(Arma arma) {
        this.armaEquipada = arma;
        System.out.println(nombre + " ha equipado " + arma.getNombre() + ".");
    }

    
    public void desequiparArma() {
        if (this.armaEquipada != null) {
            System.out.println(nombre + " ha desequipado " + this.armaEquipada.getNombre() + ".");
            this.armaEquipada = null;
        }
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }
}