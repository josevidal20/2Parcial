import modelo.*;


public class Main {
    
    /**
     * 
     * @param criatura1 
     * @param criatura2 
     */
    public static void simularBatalla(Criatura criatura1, Criatura criatura2) { 
        System.out.println("\n comienza la pelea ");
        System.out.println(criatura1.getNombre() + " (salud: " + criatura1.getSalud() + ") vs " + 
                           criatura2.getNombre() + " (salud: " + criatura2.getSalud() + ")");
        System.out.println("----");

        int turno = 1;
        Criatura atacante = criatura1;
        Criatura defensor = criatura2;

        while (criatura1.estaViva() && criatura2.estaViva()) { 
            System.out.println("\n turno " + turno + " ---");
            
            
            atacante.atacar(defensor); 

            
            Criatura temp = atacante;
            atacante = defensor;
            defensor = temp;
            
            turno++;
        }

        
        System.out.println("\n resultado final  ");
        if (criatura1.estaViva()) {
            System.out.println("" + criatura1.getNombre() + " ha ganado la batalla");
        } else if (criatura2.estaViva()) {
            System.out.println("" + criatura2.getNombre() + " ha ganado la batalla");
        } else {
            System.out.println("ambas  criaturas han caído. empate ");
        }
        System.out.println("----");
    }

    public static void main(String[] args) {
       
        Arma espadaLegendaria = new Arma("la katana", 15);
        Arma laMirra = new Arma("resina aromatica", 10);
        Arma fuegoDeDragon = new Arma("Fuego de dragon ", 8);

        
        
        Dragon rhaegal = new Dragon("Rhaegal", 300, 20, "Color verde y bronce"); 
        
        
        Mago baltasar = new Mago("Baltazar", 150, 25); 
        
        
        Guerrero samurai = new Guerrero("Samurai", 200, 30, "Pieles y plumas"); 

        
        rhaegal.equiparArma(fuegoDeDragon);
        baltasar.equiparArma(laMirra);
        samurai.equiparArma(espadaLegendaria);

        

        
        simularBatalla(baltasar, rhaegal); 

        
        Mago merlin = new Mago("merlin", 140, 35);
        Guerrero korg = new Guerrero("hector", 220, 25, "troyano");
        merlin.equiparArma(new Arma("excalibur", 12));
        korg.equiparArma(new Arma("malet", 18));
        
        simularBatalla(merlin, korg); 

        
        rhaegal.volar();
        ((Dragon)rhaegal).aterrizar(); 

        
        baltasar.aprenderHechizo("teletrasportarse");
        ((Mago)baltasar).lanzarHechizo();
    }
}