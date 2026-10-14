package common.model;

/** Animal. Clase común compartida por el cliente y el servidor (el servidor y el cliente la heredan). */
public class Animal {

    private String identificador;
    private int energia;
    private boolean vivo;
    private Punto posicion;
    private Especie especie;

    public void actualizacionEnergia(int energia) {
        // TODO: implementar
    }

    public void actualizacionPosicion(Punto posicion) {
        // TODO: implementar
    }

    public boolean consultaVida() {
        // TODO: implementar
        return false;
    }
}
