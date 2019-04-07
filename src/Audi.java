public class Audi extends Car {

    public String safety;
    public Audi(String color, String type) {
        super(color, type);
    }
    @Override
    public double getSpeed(double sec, double km){
        return km/sec*10;
    }

}
