package modelo;

import java.util.ArrayList;
import java.util.List;

 
public class Mago extends Criatura implements Magico {

    private List<String> hechizos; 

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza); 
        this.hechizos = new ArrayList<>();
        this.hechizos.add("Bola de Fuego");
    }

    @Override
    public void atacar(Criatura objetivo) {
        
        int dañoBase = this.fuerza;
        int dañoTotal = dañoBase;

        if (this.armaEquipada != null) {
            System.out.print(nombre + " canaliza energía a través de su " + armaEquipada.getNombre() + " y ");
            dañoTotal += this.armaEquipada.getDañoAdicional();
        } else {
            System.out.print(nombre + " conjura un hechizo de la nada y ");
        }

        lanzarHechizo();
        
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) {
    
        int dañoRecibido = daño;
        this.salud -= dañoRecibido;
        System.out.println(" El ataque impacta por completo. Daño final: " + dañoRecibido);
        System.out.println(nombre + " salud restante: " + this.salud);
    }

    

    @Override
    public void lanzarHechizo() {
        String hechizo = hechizos.get(0);
        System.out.print("lanza un poderoso " + hechizo + ".");
    } 

    @Override
    public void aprenderHechizo(String nuevoHechizo) {
        this.hechizos.add(nuevoHechizo);
        System.out.println(nombre + " ha aprendido el nuevo hechizo: " + nuevoHechizo + ".");
    } 
}