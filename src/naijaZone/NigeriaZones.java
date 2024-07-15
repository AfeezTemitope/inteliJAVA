package naijaZone;


public enum NigeriaZones {
    NORTH_CENTRAL("Benue,FCT,Kwara,Nassarawa,Niger,Plateau"),
    NORTH_EAST("Adamawa,Bauchi,Borno,Gombe,Taraba,Yobe"),
    NORTH_WEST("Kaduna,Kastina,Kano,Kebbi,Sokoto,Jigawa,Zamfara"),
    SOUTH_EAST("Abia,Anambra,Ebonyi,Enugu,Imo"),
    SOUTH_SOUTH(  "AkwaIbom, Bayelse, CrossRiver,Delta,Edo,Rivers"),
    SOUTH_WEST("Ekiti,Lagos, Osun, Ondo, Ogun, Oyo");

    private  String[] zone;

    NigeriaZones(String state) {
        this.zone = state.split(",");
    }

    public boolean getState(String newState) {
        for (String state : zone) {
            if (state.equalsIgnoreCase(newState)) return true;
        }
        return false;
    }

//    public static void main(String... a) {
//
//    }
}


