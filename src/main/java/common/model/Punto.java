package common.model;

//Representa un punto (x, y) dentro del mapa.
//(PuntoVisible en el cliente y Punto en el servidor).
public class Punto {

    //privadas por encapsulación,solo se leen o se modifican con los métodos de esta clase.
    private int posicionX;
    private int posicionY;

    /**
     * Constructor para que las clases hijas (y las librerías como json)
     * puedan crear un Punto sin pasarle datos.
     */
    public Punto() {
    }

    /**
     * Constructor con las coordenadas iniciales.
     * @param posicionX coordenada horizontal en el mapa
     * @param posicionY coordenada vertical en el mapa
     */
    public Punto(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public int consultaPosicionX() {
        return posicionX;
    }

    public int consultaPosicionY() {
        return posicionY;
    }

    //se cambian juntas para que el punto nunca quede con una coordenada nueva y otra vieja.
    public void actualizacionCoordenadas(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
}
