package model;

public class Ride {
    private double distance;
    private int time;
    private String id;

    public Ride(double distance, int time, String id) {
        this.distance = distance;
        this.time = time;
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
