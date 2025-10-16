package modelo;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;


public class CriaturaTest {

    
    class CriaturaDummy extends Criatura {
        public CriaturaDummy(String nombre, int salud, int fuerza) {
            super(nombre, salud, fuerza);
        }
        @Override
        public void atacar(Criatura objetivo) { }
        @Override
        public void defender(int daño) { this.salud -= daño; }
    }

    @Test
    void testEstaViva() {
        CriaturaDummy criatura = new CriaturaDummy("Test", 10, 5);
        assertTrue(criatura.estaViva(), "La criatura debe estar viva con salud > 0.");
        
        criatura.setSalud(0);
        assertFalse(criatura.estaViva(), "La criatura no debe estar viva con salud <= 0.");
    } 

    @Test
    void testEquiparArma() {
        CriaturaDummy criatura = new CriaturaDummy("Test", 100, 10);
        Arma espada = new Arma("Espada Prueba", 5);
        
        criatura.equiparArma(espada);
        assertNotNull(criatura.getArmaEquipada(), "El arma no debe ser nula después de equipar.");
        assertEquals("Espada Prueba", criatura.getArmaEquipada().getNombre(), "El nombre del arma debe coincidir.");
    } 
    
    
}
