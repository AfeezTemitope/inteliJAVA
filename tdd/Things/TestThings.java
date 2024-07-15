package Things;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static Things.Animals.*;


public class TestThings {
    private Things things;



    @BeforeEach
    public void setUp() {
         things = new Things();
    }

    @Test
    public void testThatLivingThingsAreAlive() {
        things.isAlive();
        assertTrue(things.alive() );
    }

    @Test
    public void testThatLivingThingsAreNotAlive() {
        things.isAlive();
        things.notAlive();
        assertFalse(things.alive() );
    }

    @Test
    public void testThatMammalsIsAlive() {
    Animals mammals = MAMMALS;
//    assertTrue(mammals.getAnimals() );

    }


}
