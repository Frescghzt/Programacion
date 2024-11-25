package clase_12;

import static org.junit.jupiter.api.Assertions.*; // Importar las aserciones
import org.junit.jupiter.api.Test; // Importar la anotación @Test

class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
}

public class CalculadoraTest {

    @Test // Indica que este método es una prueba unitaria
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado); // Verifica si el resultado es igual a 5
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(5, 3);
        assertEquals(2, resultado);
    }
}


