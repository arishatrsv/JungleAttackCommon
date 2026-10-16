package common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class EspecieTest {

    @Test
    void existenSieteEspecies() {
        // 2 para los jugadores y 5 para los bots
        assertEquals(7, Especie.values().length);
    }

    @Test
    void losIdentificadoresNoSeRepiten() {
        Set<String> identificadores = new HashSet<>();
        for (Especie especie : Especie.values()) {
            identificadores.add(especie.consultaIdentificador());
        }
        assertEquals(Especie.values().length, identificadores.size());
    }

    @Test
    void sePuedeBuscarUnaEspeciePorSuIdentificador() {
        assertEquals(Especie.JAGUAR, Especie.consultaPorIdentificador("jaguar"));
        assertEquals(Especie.RANA_OJOS_ROJOS, Especie.consultaPorIdentificador("rana_ojos_rojos"));
    }

    @Test
    void unIdentificadorQueNoExisteDevuelveNull() {
        assertNull(Especie.consultaPorIdentificador("dragon"));
        assertNull(Especie.consultaPorIdentificador(null));
    }
}
