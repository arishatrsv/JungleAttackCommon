package common.constantes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
class ConstantesProtocoloTest {
    @Test
    void ningunaConstanteDeTextoRepiteValor() throws IllegalAccessException {
        Set<String> valores = new HashSet<>();
        int cantidad = 0;
        for (Field campo : ConstantesProtocolo.class.getDeclaredFields()) {
            if (campo.getType() == String.class) {
                valores.add((String) campo.get(null));
                cantidad++;
            }
        }
        assertEquals(cantidad, valores.size());
    }
}