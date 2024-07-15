package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class turtleTest {
    private Turtle turtle;

    @BeforeEach
    void setUp(){
        Turtle turtle = new Turtle();
    }
    @Test
    public void testThatPenIsUp(){
        assertTrue(turtle.penIsUp());
    }
    @Test
    public void testThatPenIsDown() {
        turtle.penDown();
        assertTrue(turtle.penDown());
    }
}
