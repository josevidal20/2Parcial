package modelo;



public class Guerrero extends Criatura {

    private String tipoArmadura; 

    public Guerrero(String nombre, int salud, int fuerza, String tipoArmadura) {
        super(nombre, salud, fuerza); 
        this.tipoArmadura = tipoArmadura;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoBase = this.fuerza;
        int dañoTotal = dañoBase;

        if (this.armaEquipada != null) {
            armaEquipada.atacarConArma(objetivo); 
            dañoTotal += this.armaEquipada.getDañoAdicional();
        } else {
            System.out.println(nombre + " ataca con sus puños a " + objetivo.getNombre() + ".");
        }
        
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) {
        
        int dañoReducido = (int) (daño * 0.90); 
        this.salud -= dañoReducido;
        System.out.println(" El ataque impacta, pero la armadura absorbe parte del daño. Daño final: " + dañoReducido);
        System.out.println(nombre + " salud restante: " + this.salud);
    }
}
