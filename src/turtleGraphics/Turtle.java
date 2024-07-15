package turtleGraphics;

public class Turtle {
    private boolean penIsOn = true;

    public boolean penIsUp() {
        return penIsOn;
    }

    public boolean penDown() {
        return penIsOn = false;
    }
}
