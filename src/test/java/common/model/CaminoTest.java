package common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class CaminoTest {

    @Test
    void devuelveLosExtremosEnOrden() {
        Zona a = new Zona(1, new Punto(0, 0));
        Zona b = new Zona(2, new Punto(100, 0));
        Camino camino = new Camino(a, b, 100.0);

        Zona[] extremos = camino.consultaExtremos();
        assertSame(a, extremos[0]); // el inicio va primero
        assertSame(b, extremos[1]); // el destino va después
    }

    @Test
    void devuelveLaLongitud() {
        Camino camino = new Camino(new Zona(), new Zona(), 150.5);
        assertEquals(150.5, camino.consultaLongitud(), 0.0001);
    }
}
