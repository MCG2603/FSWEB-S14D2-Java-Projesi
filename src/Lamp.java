public class Lamp {



    public LampType style;



    public boolean battery;



    public int globalRating;

    public Lamp(LampType style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobalRating() {
        return globalRating;
    }
}
