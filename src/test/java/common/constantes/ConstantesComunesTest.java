package common.constantes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ConstantesComunesTest {

    @Test
    void elRadioDeEncuentroEsPositivo() {
        assertTrue(ConstantesComunes.ENCOUNTER_RADIUS > 0);
    }
}
