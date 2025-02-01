public class RoadTrip extends TravelPackage {
    private int distance;


    public RoadTrip(String name, String destination, int distance) {
        super(name, destination);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RoadTrip{" +
                "distance=" + distance +
                "} " + super.toString();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("distance=" + distance );
    }


    @Override
    public double cost() {
        return 50+0.2*distance;
    }
}
