package common.model;

/**
 * Contiene datos descriptivos compartidos: identificador, recurso visual, forma de ataque,
 * efecto visual. Las rutas son relativas a los recursos del cliente.
 */
public enum Especie { // un enum tiene un conjunto fijo de valores
//es la ruta, no estan en common. las imagenes vienen del cliente
    JAGUAR("jaguar", "imagenes/especies/jaguar.svg", "ZARPAZO", "imagenes/efectos/zarpazo.svg"),
    PEREZOSO("perezoso", "imagenes/especies/perezoso.svg", "ZARPAZO", "imagenes/efectos/zarpazo.svg"),
    MONO_CARABLANCA("mono_carablanca", "imagenes/especies/mono_carablanca.svg", "MORDISCO", "imagenes/efectos/mordisco.svg"),
    COCODRILO("cocodrilo", "imagenes/especies/cocodrilo.svg", "MORDISCO", "imagenes/efectos/mordisco.svg"),
    LAPA_ROJA("lapa_roja", "imagenes/especies/lapa_roja.svg", "PICOTAZO", "imagenes/efectos/picotazo.svg"),
    TUCAN("tucan", "imagenes/especies/tucan.svg", "PICOTAZO", "imagenes/efectos/picotazo.svg"),
    RANA_OJOS_ROJOS("rana_ojos_rojos", "imagenes/especies/rana_ojos_rojos.svg", "LENGUETAZO", "imagenes/efectos/lenguetazo.svg");

    private final String identificador;
    private final String imagen;
    private final String formaAtaque;
    private final String efectoVisual;

    Especie(String identificador, String imagen, String formaAtaque, String efectoVisual) {//constructor
        this.identificador = identificador;
        this.imagen = imagen;
        this.formaAtaque = formaAtaque;
        this.efectoVisual = efectoVisual;
    }

    public static Especie consultaPorIdentificador(String identificador) {
        for (Especie especie : values()) {
            if (especie.identificador.equals(identificador)) {
                return especie;
            }
        }
        return null;
    }

    public String consultaIdentificador() { 
        return identificador; }
    public String consultaImagen() { 
        return imagen; }
    public String consultaFormaAtaque() { 
        return formaAtaque; }
    public String consultaEfectoVisual() { 
        return efectoVisual; }
}
