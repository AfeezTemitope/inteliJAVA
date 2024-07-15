package naijaZone;

import javax.swing.*;

public class NaijaZone {
    public static void main(String[] args) {

        String stateToCheck = input("Enter a state name").trim();
        boolean northCentral = NigeriaZones.NORTH_CENTRAL.getState(stateToCheck);
        boolean northEast = NigeriaZones.NORTH_EAST.getState(stateToCheck);
        boolean northWest = NigeriaZones.NORTH_WEST.getState(stateToCheck);
        boolean southEast = NigeriaZones.SOUTH_EAST.getState(stateToCheck);
        boolean southSouth = NigeriaZones.SOUTH_SOUTH.getState(stateToCheck);
        boolean southWest = NigeriaZones.SOUTH_WEST.getState(stateToCheck);

        boolean invalidZoneNorth = !northCentral || !northEast || !northWest;
        boolean invalidZoneEast = !southEast || !southSouth || !southWest;

        if (northCentral) print(stateToCheck + " is in the NORTH_CENTRAL zone.");
        if (northEast) print(stateToCheck + " is in the NORTH_EAST zone.");
        if (northWest) print(stateToCheck + " is in the NORTH_WEST zone.");
        if (southEast) print(stateToCheck + " is in the SOUTH_EAST zone.");
        if (southSouth) print(stateToCheck + " is in the SOUTH_SOUTH zone.");
        if (southWest) print(stateToCheck + " is in the SOUTH_WEST zone.");
        if(invalidZoneNorth && invalidZoneEast) print(stateToCheck + " is in the INVALID ZONE zone.");




    }


    public static String input(String message){
        return JOptionPane.showInputDialog(message);
    }

    public static void print(String message){
        JOptionPane.showMessageDialog(null,message);
    }
}

