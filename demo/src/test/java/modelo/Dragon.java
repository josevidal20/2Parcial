package modelo;

public class Dragon extends Criatura implements Volador {

    private String tipoEscamas; 

    public Dragon(String nombre, int salud, int fuerza, String tipoEscamas) {
        
        super(nombre, salud, fuerza * 2); 
        this.tipoEscamas = tipoEscamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoBase = this.fuerza;
        int dañoTotal = dañoBase;

        if (this.armaEquipada != null) {
            System.out.print(nombre + " utiliza sus garras y su " + armaEquipada.getNombre() + " para atacar a " + objetivo.getNombre() + ".");
            dañoTotal += this.armaEquipada.getDañoAdicional();
        } else {
            System.out.print(nombre + " lanza un aliento de fuego a " + objetivo.getNombre() + ".");
        }
        
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) {
        
        int dañoReducido = (int) (daño * 0.85); 
        this.salud -= dañoReducido;
        System.out.println(" El ataque impacta, pero las escamas reducen el daño. Daño final: " + dañoReducido);
        System.out.println(nombre + " salud restante: " + this.salud);
    }

  

    @Override
    public void volar() {
        System.out.println(nombre + " extiende sus alas y se eleva en el aire. ");
    } 
    @Override
    public void aterrizar() {
        System.out.println(nombre + " desciende con fuerza y aterriza.");
    } 
}