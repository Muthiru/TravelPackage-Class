public class Cruise extends TravelPackage implements Discount {
     private int duration;

    public Cruise(String name, String destination, int duration) {
        super(name, destination);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Cruise{" +
                "duration=" + duration +
                "} " + super.toString();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("duration=" + duration );
    }

    @Override
    public double cost() {
       double amount = 100*(duration+4)/5;
       return amount - discountAmount()*amount;

        }


    @Override
    public double discountAmount() {
        if(duration>50) return 0.1;
        else return 0;
    }




}
