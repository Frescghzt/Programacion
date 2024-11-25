package clase_12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeroeTest {

    @Test
    public void testSalvarMundoHeroeFuerte() {
        Heroe superman = new Heroe("Superman", 90);
        assertTrue(superman.salvarMundo(), "Superman debería poder salvar el mundo");
    }

    @Test
    public void testSalvarMundoHeroeDebil() {
        Heroe robin = new Heroe("Robin", 50);
        assertFalse(robin.salvarMundo(), "Robin no debería poder salvar el mundo");
    }

    @Test
    public void testNombreHeroe() {
        Heroe batman = new Heroe("Batman", 85);
        assertEquals("Batman", batman.getNombre(), "El nombre del héroe debería ser Batman");
    }
}
