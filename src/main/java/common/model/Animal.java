package common.model;

/** 
 *  En el servidor esa clase la hereda Animal (servidor.modelo), que agrega la ruta, el destino y el ataque.
 *    De ella heredan AnimalJugador y AnimalBot.
 *  En el cliente la hereda AnimalVisible, que agrega si el animal es propio y lo necesario para dibujarlo.
 */
public class Animal {

    // Identificador único del animal dentro de la partida.
    private String identificador;

    private int energia;

    private boolean vivo;

    // Posición actual del animal en el mapa.
    private Punto posicion;

    // jaguar, tucán, etc.
    private Especie especie;

    /**
     * Constructor vacío para las clases hijas y para las librerías que crean objetos sin datos.
     * Un animal creado así queda sin vida (vivo = false) hasta que se arme con el otro constructor.
     */
    public Animal() {
    }

    //Crea un animal
    public Animal(String identificador, Especie especie, int energia, Punto posicion) {
        this.identificador = identificador;
        this.especie = especie;
        this.energia = Math.max(0, energia); // la energía nunca puede ser negativa
        this.vivo = this.energia > 0;        // con 0 de energía el animal nace muerto
        this.posicion = posicion;
    }

    public String consultaIdentificador() {
        return identificador;
    }

    public int consultaEnergia() {
        return energia;
    }

    public Punto consultaPosicion() {
        return posicion;
    }

    public Especie consultaEspecie() {
        return especie;
    }

    
    //Cambia la energía del animal. Aquí solo guardamos el valor y revisamos si murió.
    //Las reglas (cuánto recibe, el máximo de 20...) las decide el servidor.
    
    public void actualizacionEnergia(int energia) {
        if (!vivo) {
            return; // un animal muerto no recupera energía ni vuelve a la vida
        }
        this.energia = Math.max(0, energia);//math.max elige el mayor, para que nujnca sea negativa
        if (this.energia == 0) {
            this.vivo = false; // murió
        }
    }

    public void actualizacionPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public boolean consultaVida() { 
        return vivo;
    }
}