

public class Car {

    public String type;
    public String color;
    public int speed;

    public Car(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public double getSpeed(double sec, double km){
        return km/sec;
    }
}
