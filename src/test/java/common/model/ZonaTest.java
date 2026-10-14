package common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class ZonaTest {

    @Test
    void unaZonaNuevaNoTieneConexiones() {
        Zona zona = new Zona(1, new Punto(5, 5));
        assertEquals(1, zona.consultaIdentificador());
        assertTrue(zona.consultaConexiones().isEmpty());
    }

    @Test
    void actualizacionGuardaLaPosicionYLasConexiones() {
        Zona a = new Zona(1, new Punto(0, 0));
        Zona b = new Zona(2, new Punto(100, 0));
        Camino camino = new Camino(a, b, 100.0);
        Punto nueva = new Punto(7, 8);

        a.actualizacionInformacion(nueva, List.of(camino));

        assertSame(nueva, a.consultaPosicion());
        assertEquals(1, a.consultaConexiones().size());
    }

    @Test
    void laListaDeConexionesEsDeSoloLectura() {
        Zona zona = new Zona(1, new Punto(0, 0));
        assertThrows(UnsupportedOperationException.class,
                () -> zona.consultaConexiones().add(new Camino()));
    }
}
