package common.constantes;

/**
 * Constantes del protocolo de comunicación entre el cliente y el servidor.
 * Ambos utilizan los mismos valores para identificar los mensajes.
 */
public class ConstantesProtocolo {

    // Cliente -> servidor
    public static final String CREAR_PARTIDA = "CREATE_MATCH";
    public static final String UNIRSE_PARTIDA = "JOIN_MATCH";
    public static final String SELECCIONAR_ANIMAL = "SELECT_ANIMAL";
    public static final String MOVER_ANIMALES = "MOVE_ANIMALS";
    public static final String ATACAR = "ATTACK";
    public static final String VER_ZONA = "VIEW_ZONE";

    // Servidor -> cliente
    public static final String PARTIDA_CREADA = "MATCH_CREATED";
    public static final String PARTIDA_UNIDA = "MATCH_JOINED";
    public static final String ERROR = "ERROR";
    public static final String SELECCION_ANIMALES = "ANIMAL_SELECTION";
    public static final String PARTIDA_INICIADA = "GAME_STARTED";
    public static final String ACTUALIZACION_ESTADO = "STATE_UPDATE";
    public static final String FIN_PARTIDA = "GAME_OVER";

    // Mensajes internos, no viajan entre cliente y servidor, los genera cada lado por su cuenta
    public static final String DESCONEXION = "DISCONNECT";//el servidor la usa para limpiar al jugador
    public static final String TIPO_INVALIDO = "INVALID";//no es un JSON válido

    // Campos dentro del contenido (JSON)
    public static final String CAMPO_APODO = "apodo";
    public static final String CAMPO_CODIGO = "codigo";
    public static final String CAMPO_MOTIVO = "motivo";

    // Motivos de error
    public static final String MOTIVO_TIPO_DESCONOCIDO = "TIPO_DESCONOCIDO";
    public static final String MOTIVO_MENSAJE_INVALIDO = "MENSAJE_INVALIDO";
    public static final String MOTIVO_APODO_INVALIDO = "APODO_INVALIDO";
    public static final String MOTIVO_SERVIDOR_LLENO = "SERVIDOR_LLENO";
    public static final String MOTIVO_YA_EN_PARTIDA = "YA_EN_PARTIDA";
    public static final String MOTIVO_SIN_CONEXION = "SIN_CONEXION";//lo genera el propio cliente cuando no logra conectarse

    private ConstantesProtocolo() {
    }
}