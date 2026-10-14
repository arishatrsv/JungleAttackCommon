package common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnimalTest {

    private Animal crearAnimal(int energia) {
        return new Animal("A1", Especie.JAGUAR, energia, new Punto(0, 0));
    }

    @Test
    void unAnimalConEnergiaNaceVivo() {
        Animal animal = crearAnimal(20);
        assertTrue(animal.consultaVida());
        assertEquals(20, animal.consultaEnergia());
        assertEquals("A1", animal.consultaIdentificador());
        assertEquals(Especie.JAGUAR, animal.consultaEspecie());
    }

    @Test
    void alLlegarACeroElAnimalMuere() {
        Animal animal = crearAnimal(10);
        animal.actualizacionEnergia(0);
        assertEquals(0, animal.consultaEnergia());
        assertFalse(animal.consultaVida());
    }

    @Test
    void laEnergiaNegativaSeQuedaEnCero() {
        Animal animal = crearAnimal(10);
        animal.actualizacionEnergia(-5);
        assertEquals(0, animal.consultaEnergia());
        assertFalse(animal.consultaVida());
    }

    @Test
    void unAnimalMuertoNoRecuperaEnergia() {
        Animal animal = crearAnimal(10);
        animal.actualizacionEnergia(0);
        animal.actualizacionEnergia(15);
        assertEquals(0, animal.consultaEnergia());
        assertFalse(animal.consultaVida());
    }

    @Test
    void actualizacionCambiaLaPosicion() {
        Animal animal = crearAnimal(10);
        Punto nueva = new Punto(50, 60);
        animal.actualizacionPosicion(nueva);
        assertSame(nueva, animal.consultaPosicion());
    }
}
