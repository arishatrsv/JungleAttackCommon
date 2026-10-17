package common.constantes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstantesComunesTest {

    @Test
    void radioEncuentroTieneValorCorrecto() {
        assertEquals(30.0, ConstantesComunes.ENCOUNTER_RADIUS, 0.0);
    }
}