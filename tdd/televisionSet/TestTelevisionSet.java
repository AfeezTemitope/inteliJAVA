package televisionSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTelevisionSet {
    private Television tv;

    @BeforeEach
    public void setUp(){
        tv = new Television();
        tv.setOff();
    }

    @Test
    void testThatTelevisionSetIsOn(){
        tv.setOn();
        assertTrue(tv.isOn());
    }

    @Test
    void testThatTelevisionSetIsOff(){
        tv.setOn();
        tv.setOff();
        assertFalse(tv.isOn() );
    }

    @Test
    void testThatTelevisionSetCanIncreaseVolume(){
        tv.setOn();
        //tv.setVolume();
        
    }
}
