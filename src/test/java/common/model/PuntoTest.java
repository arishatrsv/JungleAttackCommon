package common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PuntoTest {

    @Test
    void elConstructorGuardaLasCoordenadas() {
        Punto punto = new Punto(10, 20);
        assertEquals(10, punto.consultaPosicionX());
        assertEquals(20, punto.consultaPosicionY());
    }

    @Test
    void actualizacionCambiaLasDosCoordenadas() {
        Punto punto = new Punto(1, 2);
        punto.actualizacionCoordenadas(30, 40);
        assertEquals(30, punto.consultaPosicionX());
        assertEquals(40, punto.consultaPosicionY());
    }
}
