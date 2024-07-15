package naijaZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static naijaZone.NigeriaZones.*;


class NigeriaZonesTest {

        @Test
        public void testThatStateExistInNorthCentral() {
            NigeriaZones nigeriaZones = NORTH_CENTRAL;
            assertTrue(nigeriaZones.getState("Benue"));
        }
        @Test
        public void testThatStateNotExistInNorthCentral() {
            NigeriaZones nigeriaZones = NORTH_CENTRAL;
            assertFalse(nigeriaZones.getState("Semicolon"));
        }
        @Test
        public void testThatStateExistIfSpeltWithAllCapsInNorthCentral() {
            NigeriaZones nigeriaZones = NORTH_CENTRAL;
            assertTrue(nigeriaZones.getState("BEnue"));
        }
        @Test
        public void testWithEmptyStateNameInNorthCentral() {
            NigeriaZones nigeriaZones = NORTH_CENTRAL;
            assertFalse(nigeriaZones.getState(""));
        }
    @Test
    public void testThatStateExistInNorthEast() {
        NigeriaZones nigeriaZones = NORTH_EAST;
        assertTrue(nigeriaZones.getState("Benue"));
    }
    @Test
    public void testThatStateNotExistInNorthEast() {
        NigeriaZones nigeriaZones = NORTH_EAST;
        assertFalse(nigeriaZones.getState("Semicolon"));
    }
    @Test
    public void testThatStateExistIfSpeltWithAllCapsInNorthEast() {
        NigeriaZones nigeriaZones = NORTH_EAST;
        assertTrue(nigeriaZones.getState("BEnue"));
    }
    @Test
    public void testWithEmptyStateNameInNorthEast() {
        NigeriaZones nigeriaZones = NORTH_EAST;
        assertFalse(nigeriaZones.getState(""));
    }

    }

