package interfaces.myList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    private List myList;

    @BeforeEach
    void setUp() {
       myList = new List();
    }

    @Test
    void testAddTo() {
        myList.addTo("G-string");
        assertEquals(1,myList.getSize() );
    }

    @Test
    void testRemoveFrom() {
        myList.addTo("G-string");
        myList.removeFrom("G-string");
        assertEquals(0,myList.getSize() );
    }

    @Test
    void testAddTwoStrings() {
        myList.addTo("G-string");
        myList.addTo("F-string");
        assertEquals(2,myList.getSize() );
    }

}