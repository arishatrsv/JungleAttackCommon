package common.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa un lugar como Monteverde o Tortuguero
 * En el servidor la hereda Zona (servidor.mapa), que agrega los animales y las tazas presentes
 * En el cliente la hereda ZonaVisible, que agrega las conexiones visibles.
 */
public class Zona {

    // Número único de la zona dentro del mapa (del 1 al 12).
    private int identificador;

    // Punto central de la zona en el mapa.
    private Punto posicion;

    // Caminos que salen de esta zona o llegan a ella. El mapa funciona como un grafo.
    private List<Camino> conexiones;

    //la lista de conexiones creada para no tener nunca un null.
    public Zona() {
        this.conexiones = new ArrayList<>();
    }

    /**
     * Crea una zona sin conexiones. Las conexiones se agregan con
     * actualizacionInformacion(), porque un Camino necesita que las dos zonas ya existan.
     */
    public Zona(int identificador, Punto posicion) {
        this.identificador = identificador;
        this.posicion = posicion;
        this.conexiones = new ArrayList<>();
    }

    public int consultaIdentificador() {
        return identificador;
    }

    public Punto consultaPosicion() {
        return posicion;
    }

    /**
     * La lista es de solo lectura, si alguien quiere
     * cambiar las conexiones tiene que usar actualizacionInformacion().
     */
    public List<Camino> consultaConexiones() {
        return Collections.unmodifiableList(conexiones);
    }


    //Copia de la lista para que, si después la modifican afuera, no me cambie la zona.
    public void actualizacionInformacion(Punto posicion, List<Camino> conexiones) {
        this.posicion = posicion;
        this.conexiones = new ArrayList<>(conexiones);
    }
}