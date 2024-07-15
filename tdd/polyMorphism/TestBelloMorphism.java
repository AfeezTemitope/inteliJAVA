package polyMorphism;

import org.junit.jupiter.api.Test;

public class TestBelloMorphism {
    @Test
    void testThatAfeezOveridesBello() {
        Bello bello = new Afeez();
        System.out.println(bello.getClass().getSimpleName() );
    }

    @Test
    void testThatBelloOveridesBello() {
        Bello[] bellos = new Bello[3];
        bellos[0] = new Afeez();
        bellos[1] = new Abeeb();
        bellos[2] = new Ahmed();
        for (Bello belz: bellos){
            belz.pray();
        }
    }
}
