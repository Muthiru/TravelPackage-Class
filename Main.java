//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String ex2a(String s) {
        s = s.replace('_', ' ');
        s = s.toUpperCase();
        return s;
    }
    public static void ex2b(String s) throws Exception {
        if(!s.contains("ERROR")) throw new Exception("no ERROR substring in your string");
    }

    public static String ex32c(String[] sarr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sarr.length; i++) {
            sb.append(sarr[i]);
            if (i < sarr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TravelPackage travelPackage = new RoadTrip("Nganya", "Naivasha", 100);
        TravelPackage travelPackage1 = new Cruise("Starline", "Estonia", 150);
        TravelPackage [] travelPackages = {travelPackage, travelPackage1};
        BookingSystem bookingSystem = new BookingSystem(travelPackages);
        bookingSystem.displayBookingDetails();
        System.out.println("Total cost: " + bookingSystem.totalCost());


        System.out.println(ex2a("ala_has_a_cat"));
        try{
            ex2b("lalala");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String[] arrs = {"apple", "banana", "carrots"};
        System.out.println(ex32c(arrs));


    }
}