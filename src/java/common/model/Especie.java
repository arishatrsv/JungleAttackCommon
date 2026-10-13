package common.model;

/**
 * Especies del juego (propuesta provisional: 7 especies, 2 para los jugadores y 5 para los bots).
 * Contiene datos descriptivos compartidos: identificador, recurso visual, forma de ataque,
 * efecto visual y sonido opcional. Las rutas son relativas a los recursos del cliente.
 */
public enum Especie {

    JAGUAR("jaguar", "imagenes/especies/jaguar.svg", "ZARPAZO", "imagenes/efectos/zarpazo.svg", null),
    PEREZOSO("perezoso", "imagenes/especies/perezoso.svg", "ZARPAZO", "imagenes/efectos/zarpazo.svg", null),
    MONO_CARABLANCA("mono_carablanca", "imagenes/especies/mono_carablanca.svg", "MORDISCO", "imagenes/efectos/mordisco.svg", null),
    COCODRILO("cocodrilo", "imagenes/especies/cocodrilo.svg", "MORDISCO", "imagenes/efectos/mordisco.svg", null),
    LAPA_ROJA("lapa_roja", "imagenes/especies/lapa_roja.svg", "PICOTAZO", "imagenes/efectos/picotazo.svg", null),
    TUCAN("tucan", "imagenes/especies/tucan.svg", "PICOTAZO", "imagenes/efectos/picotazo.svg", null),
    RANA_OJOS_ROJOS("rana_ojos_rojos", "imagenes/especies/rana_ojos_rojos.svg", "LENGUETAZO", "imagenes/efectos/lenguetazo.svg", null);

    private final String identificador;
    private final String imagen;
    private final String formaAtaque;
    private final String efectoVisual;
    private final String sonido;

    Especie(String identificador, String imagen, String formaAtaque, String efectoVisual, String sonido) {
        this.identificador = identificador;
        this.imagen = imagen;
        this.formaAtaque = formaAtaque;
        this.efectoVisual = efectoVisual;
        this.sonido = sonido;
    }

    public String consultaIdentificador() { return identificador; }
    public String consultaImagen() { return imagen; }
    public String consultaFormaAtaque() { return formaAtaque; }
    public String consultaEfectoVisual() { return efectoVisual; }
    public String consultaSonido() { return sonido; }
}
