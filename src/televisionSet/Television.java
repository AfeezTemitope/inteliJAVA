package televisionSet;

public class Television {


    private int currentChannel;
    private int volumeLevel;
    private  boolean isOn;

    public Television() {
        this.currentChannel = currentChannel;
        this.volumeLevel = volumeLevel;
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
    public void setOn() {
        this.isOn = true;
    }
    public void setOff() {
        this.isOn = false;
    }
}
