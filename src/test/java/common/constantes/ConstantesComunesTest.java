package common.constantes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class ConstantesComunesTest {

    // Lee el mapa que viene en los recursos de common, tal como lo harán el cliente y el servidor.
    private String leerMapa() throws IOException {
        try (InputStream entrada = ConstantesComunes.class.getClassLoader()
                .getResourceAsStream(ConstantesComunes.RECURSO_MAPA)) {
            assertNotNull(entrada, "mapa.json debe estar en los recursos de common");
            return new String(entrada.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    @Test
    void elRecursoDelMapaExisteEnCommon() throws IOException {
        assertTrue(leerMapa().length() > 0);
    }

    @Test
    void elMapaTraeLosCamposQueDeclaranLasConstantes() throws IOException {
        String mapa = leerMapa();
        String[] campos = {
            ConstantesComunes.MAPA_ANCHO, ConstantesComunes.MAPA_ALTO, ConstantesComunes.MAPA_ZONAS,
            ConstantesComunes.MAPA_CAMINOS, ConstantesComunes.ZONA_POLIGONO, ConstantesComunes.ZONA_NOMBRE,
            ConstantesComunes.CAMINO_DESDE, ConstantesComunes.CAMINO_HASTA, ConstantesComunes.CAMINO_LONGITUD
        };
        for (String campo : campos) {
            assertTrue(mapa.contains("\"" + campo + "\""), "falta el campo " + campo);
        }
    }

    @Test
    void elMapaTieneDoceZonasYQuinceCaminos() throws IOException {
        String mapa = leerMapa();
        assertEquals(12, mapa.split("\"" + ConstantesComunes.ZONA_NOMBRE + "\"", -1).length - 1);
        assertEquals(15, mapa.split("\"" + ConstantesComunes.CAMINO_DESDE + "\"", -1).length - 1);
    }

    @Test
    void laVelocidadDeLosAnimalesEsPositiva() {
        assertTrue(ConstantesComunes.ANIMAL_SPEED > 0);
    }
}
