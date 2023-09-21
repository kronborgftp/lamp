public class Lamp {

    private String name;
    private boolean isOn;

    public Lamp(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public Lamp(String name) {
        this.name = name;
        this.isOn = false;
    }


    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    //toogle the lamps state
    public void toggle() {
        isOn = !isOn;
    }

    //getter method to check if the lamp is on
    public boolean isOn() {
        return isOn;
    }

    //getter for name
    public String getName() {
        return name;
    }

    public String toString() {
        return name + " is on " + isOn;
    }

}
