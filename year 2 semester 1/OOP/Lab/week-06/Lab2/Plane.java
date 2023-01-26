package lab2_Done;


public class Plane extends Vehicle implements Flyable {

    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;

    public Plane() {
        this(0.0, "", "");
    }

    public Plane(double fuel, String airline, String boeing) {
        setFuel(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    public void setAirline(String airline) {

    }

    public String getAirline() {
        return this.airline;
    }

    public void setBoeing(String boeing) {

    }

    public String getBoeing() {
        return this.boeing;
    }

    public void startEngine() {
        if (getFuel() >= 20) {
            setFuel(-20.0);
            System.out.println("Plane’s Engine starts");
        } 
        else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }

    public void honk() {
        System.out.println("Weeeeeee");
    }

    public void fly() {
        if (getFuel() >= 20) {
            setFuel(-20.0);
            System.out.println("Plane Fly");
        } 
        else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    public void takeOff() {
        if (getFuel() >= 10) {
            setFuel(-10.0);
            System.out.println("Plane Already to Take Off");
        } 
        else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void landing() {
        if (getFuel() >= 10) {
            setFuel(-10.0);
            System.out.println("Plane Already to Landing");
        } 
        else {
            System.out.println("Fuel is nearly empty.");
        }
    }
}