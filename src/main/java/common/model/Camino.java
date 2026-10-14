package common.model;

/**
 * - conexión entre dos zonas del mapa, por aquí caminan los animales.
 * en el servidor la hereda Camino (servidor.mapa)
 * en el cliente la hereda CaminoVisible.
 */
public class Camino {

    // Los dos extremos del camino. Son zonas, no puntos, porque el mapa es un grafo de zonas.
    private Zona inicio;
    private Zona destino;

    // Largo del camino, para calcular rutas (por ejemplo con Dijkstra).
    private double longitud;

    public Camino() { //constructor
    }
/*@param se utiliza en Javadoc para explicar qué significa cada parámetro que recibe un método o constructor. 
*Se escribe el nombre del parámetro y una descripción breve. 
VS Code puede mostrar esta explicación al pasar el cursor sobre el método o constructor. */
    /**
     * Crea un camino entre dos zonas.
     *
     * @param inicio   zona donde empieza el camino
     * @param destino  zona donde termina el camino
     * @param longitud largo del camino
     */
    public Camino(Zona inicio, Zona destino, double longitud) {
        this.inicio = inicio;
        this.destino = destino;
        this.longitud = longitud;
    }

    //Devuelve los dos extremos del camino
    public Zona[] consultaExtremos() { // es una lista de dos elementos
        return new Zona[] { inicio, destino };
    }

    public double consultaLongitud() {
        return longitud;
    }
}
