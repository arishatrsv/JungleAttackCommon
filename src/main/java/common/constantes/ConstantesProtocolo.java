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
    public static final String CAMPO_ESPECIE = "especie";
    public static final String CAMPO_DISPONIBLES = "disponibles";
    public static final String CAMPO_PROPIA = "propia";
    public static final String CAMPO_OPONENTE = "oponente";
    public static final String CAMPO_COMPLETA = "completa";

    // Separador de las listas de especies
    public static final String SEPARADOR_LISTA = ",";

    // Campos del contenido de GAME_STARTED (estos sí viajan con tipos reales de JSON: números, listas y objetos)
    public static final String CAMPO_ZONA_INICIAL = "zonaInicial";
    public static final String CAMPO_ZONAS_VISIBLES = "zonasVisibles";
    public static final String CAMPO_DANIO = "danio";
    public static final String CAMPO_ANIMALES = "animales";
    public static final String CAMPO_TAZAS = "tazas";
    public static final String CAMPO_BANDERAS = "banderas";
    public static final String CAMPO_TAZAS_CONSUMIDAS = "tazasConsumidas"; // cuántas tazas ha consumido el propio jugador
    public static final String CAMPO_BOTS_ELIMINADOS = "botsEliminados"; // cuántos bots ha eliminado el propio jugador
    public static final String CAMPO_EVENTOS = "eventos"; // ataques y muertes recientes, para mostrar los efectos

    // Campos de MOVE_ANIMALS (el cliente los manda como texto, igual que los mensajes del lobby):
    // los identificadores de los animales separados por comas, y el destino en las coordenadas de mapa.json.
    public static final String CAMPO_IDS_ANIMALES = "idsAnimales";

    // Campos de ATTACK: los animales que atacan (CAMPO_IDS_ANIMALES, separados por comas) y el animal atacado.
    public static final String CAMPO_OBJETIVO = "objetivo";

    // Campos de GAME_OVER (el servidor se lo envía a cada jugador con su propio resultado).
    public static final String CAMPO_RESULTADO = "resultado";
    public static final String RESULTADO_VICTORIA = "VICTORIA";
    public static final String RESULTADO_DERROTA = "DERROTA";
    public static final String CAMPO_GANADOR = "ganador"; // apodo del jugador que ganó
    public static final String CAMPO_RAZON = "razon";
    public static final String RAZON_BANDERA = "BANDERA"; // tocó la bandera del oponente
    public static final String RAZON_ABANDONO = "ABANDONO"; // el oponente se desconectó con la partida en curso
    public static final String CAMPO_DURACION = "duracion"; // segundos que duró la partida
    public static final String CAMPO_RESUMEN_PROPIO = "resumenPropio";
    public static final String CAMPO_RESUMEN_OPONENTE = "resumenOponente";
    public static final String CAMPO_ANIMALES_PERDIDOS = "animalesPerdidos"; // animales de la manada que murieron

    // Campos de cada evento dentro de CAMPO_EVENTOS
    public static final String CAMPO_TIPO_EVENTO = "tipoEvento";
    public static final String CAMPO_ATACANTE = "atacante";
    public static final String EVENTO_ATAQUE = "ATAQUE";
    public static final String EVENTO_MUERTE = "MUERTE";

    // Campos de cada animal, taza o bandera dentro de esas listas
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_ENERGIA = "energia";
    public static final String CAMPO_ENERGIA_MAXIMA = "energiaMaxima";
    public static final String CAMPO_X = "x";
    public static final String CAMPO_Y = "y";
    public static final String CAMPO_ZONA = "zona";
    public static final String CAMPO_ES_PROPIO = "esPropio";
    public static final String CAMPO_ES_BOT = "esBot";

    // Motivos de error
    public static final String MOTIVO_TIPO_DESCONOCIDO = "TIPO_DESCONOCIDO";
    public static final String MOTIVO_MENSAJE_INVALIDO = "MENSAJE_INVALIDO";
    public static final String MOTIVO_APODO_INVALIDO = "APODO_INVALIDO";
    public static final String MOTIVO_SERVIDOR_LLENO = "SERVIDOR_LLENO";
    public static final String MOTIVO_YA_EN_PARTIDA = "YA_EN_PARTIDA";
    public static final String MOTIVO_PARTIDA_NO_ENCONTRADA = "PARTIDA_NO_ENCONTRADA";
    public static final String MOTIVO_PARTIDA_LLENA = "PARTIDA_LLENA";
    public static final String MOTIVO_FASE_INCORRECTA = "FASE_INCORRECTA";
    public static final String MOTIVO_ESPECIE_INVALIDA = "ESPECIE_INVALIDA";
    public static final String MOTIVO_ESPECIE_NO_DISPONIBLE = "ESPECIE_NO_DISPONIBLE";
    public static final String MOTIVO_ESPECIE_YA_ELEGIDA = "ESPECIE_YA_ELEGIDA";
    public static final String MOTIVO_OPONENTE_DESCONECTADO = "OPONENTE_DESCONECTADO";
    public static final String MOTIVO_ANIMAL_INVALIDO = "ANIMAL_INVALIDO"; // un animal no existe, no es del jugador o está muerto
    public static final String MOTIVO_DESTINO_INVALIDO = "DESTINO_INVALIDO"; // el destino no es un punto del mapa
    public static final String MOTIVO_OBJETIVO_INVALIDO = "OBJETIVO_INVALIDO"; // el animal atacado no existe, ya murió, es propio o no se ve
    public static final String MOTIVO_FUERA_DE_ALCANCE = "FUERA_DE_ALCANCE"; // ningún animal elegido está cerca del objetivo
    public static final String MOTIVO_SIN_CONEXION = "SIN_CONEXION";//lo genera el propio cliente cuando no logra conectarse
    public static final String MOTIVO_ERROR_INTERNO = "ERROR_INTERNO"; // un comando falló dentro del servidor; el cliente sigue conectado

    private ConstantesProtocolo() {
    }
}