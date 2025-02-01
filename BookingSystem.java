public class BookingSystem {
    TravelPackage[] travelPackages;

    public BookingSystem(TravelPackage[] travelPackages) {
        this.travelPackages = travelPackages;
    }

    public TravelPackage[] getTravelPackages() {
        return travelPackages;
    }

    public void setTravelPackages(TravelPackage[] travelPackages) {
        this.travelPackages = travelPackages;
    }


    public void displayBookingDetails() {
        for (TravelPackage travelPackage : travelPackages) {
            travelPackage.printInfo();
        }
    }

    public double totalCost() {
        double sum = 0;
        for (TravelPackage travelPackage : travelPackages) {
            sum += travelPackage.cost();

        }
        return sum;

    }
}








