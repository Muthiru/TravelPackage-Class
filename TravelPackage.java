public  abstract class TravelPackage {
    private String name;
    private String destination;

    public TravelPackage(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' + " cost " + cost() +
                '}';
    }

    public void printInfo(){
        System.out.println("TravelPackage{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                '}');

    }
    public  abstract double cost();
    public boolean isCheaper(TravelPackage travelPackage){
        return cost()<travelPackage.cost();
    }
}
