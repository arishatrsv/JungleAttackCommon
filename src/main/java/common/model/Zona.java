package common.model;

import java.util.List;

/** Zona del mapa. Clase común compartida por el cliente y el servidor. */
public class Zona {

    private int identificador;
    private Punto posicion;
    private List<Camino> conexiones;

    public List<Camino> consultaConexiones() {
        // TODO: implementar
        return null;
    }

    public void actualizacionInformacion() {
        // TODO: implementar
    }
}
