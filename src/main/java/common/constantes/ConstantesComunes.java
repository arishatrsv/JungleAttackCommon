package common.constantes;

/**
 * Constantes que deben tener el mismo valor en el cliente y en el servidor.
 * Por ahora contiene todo lo necesario para leer el mapa (mapa.json) de la misma forma en ambos lados.
 */
public class ConstantesComunes {

    // Nombre del archivo del mapa dentro de los recursos de common.
    public static final String RECURSO_MAPA = "mapa.json";

    // Campos de mapa.json: el mapa completo.
    public static final String MAPA_ANCHO = "ancho";
    public static final String MAPA_ALTO = "alto";
    public static final String MAPA_ZONAS = "zonas";
    public static final String MAPA_CAMINOS = "caminos";

    // Campos de cada zona en mapa.json.
    public static final String ZONA_ID = "id";
    public static final String ZONA_NOMBRE = "nombre";
    public static final String ZONA_X = "x";
    public static final String ZONA_Y = "y";
    public static final String ZONA_POLIGONO = "poligono";

    // Campos de cada camino en mapa.json.
    public static final String CAMINO_ID = "id";
    public static final String CAMINO_DESDE = "desde";
    public static final String CAMINO_HASTA = "hasta";
    public static final String CAMINO_LONGITUD = "longitud";

    private ConstantesComunes() {
    }
}
